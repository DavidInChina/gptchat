package Pf;

import Mf.AbstractC1003l;
import kg.AbstractC4296h;
import kg.C4294f;
import vg.AbstractC6047a;

/* loaded from: classes2.dex */
public final class S extends AbstractC1146d {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1003l f14061h0;

    /* renamed from: i0  reason: collision with root package name */
    public final vg.f f14062i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(AbstractC1003l abstractC1003l, AbstractC6047a abstractC6047a, Nf.i iVar) {
        this(abstractC1003l, abstractC6047a, iVar, AbstractC4296h.f37514d);
        if (abstractC1003l == null) {
            C(0);
            throw null;
        } else if (iVar != null) {
        } else {
            C(2);
            throw null;
        }
    }

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 7 && i10 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 7 && i10 != 8) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 != 7) {
            if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getValue";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 7 || i10 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        AbstractC1003l abstractC1003l = this.f14061h0;
        if (abstractC1003l != null) {
            return abstractC1003l;
        }
        C(8);
        throw null;
    }

    @Override // Pf.AbstractC1146d
    public final vg.f p0() {
        vg.f fVar = this.f14062i0;
        if (fVar != null) {
            return fVar;
        }
        C(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AbstractC1003l abstractC1003l, AbstractC6047a abstractC6047a, Nf.i iVar, C4294f c4294f) {
        super(iVar, c4294f);
        if (abstractC1003l == null) {
            C(3);
            throw null;
        } else if (iVar == null) {
            C(5);
            throw null;
        } else if (c4294f != null) {
            this.f14061h0 = abstractC1003l;
            this.f14062i0 = abstractC6047a;
        } else {
            C(6);
            throw null;
        }
    }
}
