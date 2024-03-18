package Ag;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public class l extends j implements s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, AbstractC6216a abstractC6216a) {
        super(qVar, abstractC6216a);
        if (qVar != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // Ag.j, wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object mo122invoke = super.mo122invoke();
        if (mo122invoke != null) {
            return mo122invoke;
        }
        a(2);
        throw null;
    }
}
