package Ag;

/* loaded from: classes2.dex */
public final class n extends m implements r {
    @Override // Ag.m, wf.k
    public final Object invoke(Object obj) {
        Object invoke = super.invoke(obj);
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
    }
}
