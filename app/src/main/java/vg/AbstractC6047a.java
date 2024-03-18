package vg;

import Bg.A;

/* renamed from: vg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6047a implements f {

    /* renamed from: Y  reason: collision with root package name */
    public final A f47527Y;

    public AbstractC6047a(A a5) {
        if (a5 != null) {
            this.f47527Y = a5;
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1 && i10 != 2) {
            objArr[0] = "receiverType";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // vg.f
    public final A getType() {
        A a5 = this.f47527Y;
        if (a5 != null) {
            return a5;
        }
        a(1);
        throw null;
    }
}
