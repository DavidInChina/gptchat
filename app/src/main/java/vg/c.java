package vg;

import Bg.A;
import Mf.AbstractC0993b;

/* loaded from: classes.dex */
public final class c extends AbstractC6047a {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC0993b f47531Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC0993b abstractC0993b, A a5) {
        super(a5);
        if (abstractC0993b != null) {
            if (a5 != null) {
                this.f47531Z = abstractC0993b;
                return;
            }
            a(1);
            throw null;
        }
        a(0);
        throw null;
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
                if (i10 != 3) {
                    objArr[0] = "callableDescriptor";
                } else {
                    objArr[0] = "newType";
                }
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
            }
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f47531Z + "}";
    }
}
