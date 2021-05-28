package nullable_func

fun strLen(s:String) = s.length

fun strLen_(s:String?) = s?.length

fun strLen__(s:String?) = s?.length?:0