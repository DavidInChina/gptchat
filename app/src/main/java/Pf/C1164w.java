package Pf;

import Bg.h0;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4294f;

/* renamed from: Pf.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1164w implements AbstractC1012v {

    /* renamed from: a  reason: collision with root package name */
    public h0 f14136a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC1003l f14137b;

    /* renamed from: c  reason: collision with root package name */
    public Mf.A f14138c;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC1007p f14139d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC1013w f14140e;

    /* renamed from: f  reason: collision with root package name */
    public int f14141f;

    /* renamed from: g  reason: collision with root package name */
    public List f14142g;

    /* renamed from: h  reason: collision with root package name */
    public final List f14143h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC1146d f14144i;

    /* renamed from: j  reason: collision with root package name */
    public AbstractC1146d f14145j;

    /* renamed from: k  reason: collision with root package name */
    public Bg.A f14146k;

    /* renamed from: l  reason: collision with root package name */
    public C4294f f14147l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14148m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14149n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14150o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14151p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14152q;

    /* renamed from: r  reason: collision with root package name */
    public List f14153r;

    /* renamed from: s  reason: collision with root package name */
    public Nf.i f14154s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14155t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f14156u;

    /* renamed from: v  reason: collision with root package name */
    public Boolean f14157v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14158w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ AbstractC1165x f14159x;

    public C1164w(AbstractC1165x abstractC1165x, h0 h0Var, AbstractC1003l abstractC1003l, Mf.A a5, AbstractC1007p abstractC1007p, int i10, List list, List list2, AbstractC1146d abstractC1146d, Bg.A a10) {
        if (h0Var != null) {
            if (abstractC1003l != null) {
                if (a5 != null) {
                    if (abstractC1007p != null) {
                        if (i10 != 0) {
                            if (list != null) {
                                if (list2 != null) {
                                    if (a10 != null) {
                                        this.f14159x = abstractC1165x;
                                        this.f14140e = null;
                                        this.f14145j = abstractC1165x.f14174o0;
                                        this.f14148m = true;
                                        this.f14149n = false;
                                        this.f14150o = false;
                                        this.f14151p = false;
                                        this.f14152q = abstractC1165x.f14184y0;
                                        this.f14153r = null;
                                        this.f14154s = null;
                                        this.f14155t = abstractC1165x.f14185z0;
                                        this.f14156u = new LinkedHashMap();
                                        this.f14157v = null;
                                        this.f14158w = false;
                                        this.f14136a = h0Var;
                                        this.f14137b = abstractC1003l;
                                        this.f14138c = a5;
                                        this.f14139d = abstractC1007p;
                                        this.f14141f = i10;
                                        this.f14142g = list;
                                        this.f14143h = list2;
                                        this.f14144i = abstractC1146d;
                                        this.f14146k = a10;
                                        this.f14147l = null;
                                        return;
                                    }
                                    r(7);
                                    throw null;
                                }
                                r(6);
                                throw null;
                            }
                            r(5);
                            throw null;
                        }
                        r(4);
                        throw null;
                    }
                    r(3);
                    throw null;
                }
                r(2);
                throw null;
            }
            r(1);
            throw null;
        }
        r(0);
        throw null;
    }

    public static /* synthetic */ void r(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i11 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i10) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v a(Nf.i iVar) {
        if (iVar != null) {
            this.f14154s = iVar;
            return this;
        }
        r(35);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v b(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            this.f14137b = abstractC1003l;
            return this;
        }
        r(8);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v c(List list) {
        this.f14142g = list;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v d(AbstractC1007p abstractC1007p) {
        if (abstractC1007p != null) {
            this.f14139d = abstractC1007p;
            return this;
        }
        r(12);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v e(int i10) {
        if (i10 != 0) {
            this.f14141f = i10;
            return this;
        }
        r(14);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1013w f() {
        return this.f14159x.z0(this);
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v g(C4294f c4294f) {
        if (c4294f != null) {
            this.f14147l = c4294f;
            return this;
        }
        r(17);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v h() {
        this.f14150o = true;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v i() {
        this.f14156u.put(Wf.f.f21083M0, Boolean.TRUE);
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v j() {
        this.f14155t = true;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v k() {
        this.f14148m = false;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v l() {
        this.f14153r = kf.v.f37483Y;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v m() {
        this.f14152q = true;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v n(Bg.A a5) {
        if (a5 != null) {
            this.f14146k = a5;
            return this;
        }
        r(23);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v o(Mf.A a5) {
        if (a5 != null) {
            this.f14138c = a5;
            return this;
        }
        r(10);
        throw null;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v p(AbstractC1146d abstractC1146d) {
        this.f14145j = abstractC1146d;
        return this;
    }

    @Override // Mf.AbstractC1012v
    public final AbstractC1012v q() {
        this.f14149n = true;
        return this;
    }
}
