package Ag;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public class j implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final q f856Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6216a f857Z;

    /* renamed from: h0  reason: collision with root package name */
    public volatile Object f858h0;

    public j(q qVar, AbstractC6216a abstractC6216a) {
        if (qVar != null) {
            this.f858h0 = o.f863Y;
            this.f856Y = qVar;
            this.f857Z = abstractC6216a;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 3) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i10 != 2 && i10 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3) {
            throw new IllegalStateException(format);
        }
    }

    public p e(boolean z10) {
        p e10 = this.f856Y.e("in a lazy value", null);
        if (e10 != null) {
            return e10;
        }
        a(2);
        throw null;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public Object mo122invoke() {
        Object obj = this.f858h0;
        if (!(obj instanceof o)) {
            Ig.i.k(obj);
            return obj;
        }
        this.f856Y.f871a.b();
        try {
            Object obj2 = this.f858h0;
            if (!(obj2 instanceof o)) {
                Ig.i.k(obj2);
            } else {
                o oVar = o.f864Z;
                o oVar2 = o.f865h0;
                if (obj2 == oVar) {
                    this.f858h0 = oVar2;
                    p e10 = e(true);
                    if (!e10.f868b) {
                        obj2 = e10.f867a;
                    }
                }
                if (obj2 == oVar2) {
                    p e11 = e(false);
                    if (!e11.f868b) {
                        obj2 = e11.f867a;
                    }
                }
                this.f858h0 = oVar;
                obj2 = this.f857Z.mo122invoke();
                c(obj2);
                this.f858h0 = obj2;
            }
            return obj2;
        } finally {
            this.f856Y.f871a.a();
        }
    }

    public void c(Object obj) {
    }
}
