package Ag;

/* loaded from: classes2.dex */
public final class f extends g {
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                }
            } else {
                objArr[0] = "computation";
            }
        } else {
            objArr[0] = "map";
        }
        if (i10 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
        } else {
            objArr[2] = "computeIfAbsent";
        }
        String format = String.format(str, objArr);
        if (i10 != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }
}
