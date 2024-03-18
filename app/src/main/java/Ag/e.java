package Ag;

import Bg.C0216i;
import Bg.C0217j;
import Uf.A;

/* loaded from: classes2.dex */
public final class e extends k implements s {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f851j0 = C0216i.f2124Y;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f852k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, A a5, C0217j c0217j) {
        super(qVar, a5);
        this.f852k0 = c0217j;
        if (qVar != null) {
            this.f859i0 = null;
            return;
        }
        f(0);
        throw null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i10 != 2) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i10 != 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static /* synthetic */ void f(int i10) {
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
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

    @Override // Ag.j
    public final p e(boolean z10) {
        wf.k kVar = this.f851j0;
        if (kVar == null) {
            return super.e(z10);
        }
        return new p(kVar.invoke(Boolean.valueOf(z10)), false);
    }

    @Override // Ag.k, Ag.j, wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object mo122invoke = super.mo122invoke();
        if (mo122invoke != null) {
            return mo122invoke;
        }
        f(2);
        throw null;
    }
}
