/**
 * Passing anonymous comparison functions:
 *
 * In this example, the initial sort() call receives an array as its first argument, followed by an anonymous
 * comparison function. When called, the anonymous comparison function executes return i - j; to achieve
 * an ascending sort. By reversing i and j, the second comparison function achieves a descending sort.
 * The third and fourth sort() calls receive anonymous comparison functions that are slightly different
 * in order to properly compare string values.
 * */
const sort = (a, cmp) => {
    for(let pass = 0; pass < a.length - 1; pass++){
        for(let i = a.length - 1; i > pass; i--){
            if(cmp(a[i], a[pass]) < 0){
                let temp = a[i];
                a[i] = a[pass];
                a[pass] = temp;
            }
        }
    }
};

var a = [22, 91, 3, 45, 64, 67, -1];
sort(a, (i, j) => {
    return i - j;
});

a.forEach(function(entry) { console.log(entry) })
console.log('\n');

a = ["X", "E", "Q", "A", "P"];

sort(a, function(i, j)
{
    return i < j ? -1 : i > j;
})

a.forEach(function(entry) { console.log(entry) })
console.log('\n')
sort(a, function(i, j)
{
    return i > j ? -1 : i < j;
})
a.forEach(function(entry) { console.log(entry) })
