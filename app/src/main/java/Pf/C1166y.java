package Pf;

import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import kg.AbstractC4296h;

/* renamed from: Pf.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1166y extends AbstractC1146d {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC0997f f14186h0;

    /* renamed from: i0  reason: collision with root package name */
    public final vg.d f14187i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166y(AbstractC1144b abstractC1144b) {
        super(Nf.h.f12822a, AbstractC4296h.f37514d);
        if (abstractC1144b != null) {
            this.f14186h0 = abstractC1144b;
            this.f14187i0 = new vg.d(abstractC1144b);
            return;
        }
        C(0);
        throw null;
    }

    public static /* synthetic */ void C(int i10) {
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
            if (i10 != 3) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "newOwner";
            }
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        AbstractC0997f abstractC0997f = this.f14186h0;
        if (abstractC0997f != null) {
            return abstractC0997f;
        }
        C(2);
        throw null;
    }

    @Override // Pf.AbstractC1146d
    public final vg.f p0() {
        vg.d dVar = this.f14187i0;
        if (dVar != null) {
            return dVar;
        }
        C(1);
        throw null;
    }

    @Override // Pf.AbstractC1158p
    public final String toString() {
        return "class " + this.f14186h0.getName() + "::this";
    }
}
