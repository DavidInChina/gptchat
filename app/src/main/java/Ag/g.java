package Ag;

import j$.util.concurrent.ConcurrentHashMap;
import kg.C4292d;

/* loaded from: classes2.dex */
public abstract class g extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, ConcurrentHashMap concurrentHashMap) {
        super(qVar, concurrentHashMap, new C4292d(3));
        if (qVar != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
        } else {
            objArr[0] = "map";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "computeIfAbsent";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
