package Pf;

import Mf.AbstractC1003l;
import kg.C4294f;

/* renamed from: Pf.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1155m extends AbstractC1144b {

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC1003l f14109j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Mf.V f14110k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f14111l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1155m(Ag.u uVar, AbstractC1003l abstractC1003l, C4294f c4294f, Mf.V v10) {
        super(uVar, c4294f);
        if (uVar != null) {
            if (abstractC1003l != null) {
                if (c4294f != null) {
                    this.f14109j0 = abstractC1003l;
                    this.f14110k0 = v10;
                    this.f14111l0 = false;
                    return;
                }
                p0(2);
                throw null;
            }
            p0(1);
            throw null;
        }
        p0(0);
        throw null;
    }

    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 5) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        objArr[0] = "storageManager";
                    } else {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
                    }
                } else {
                    objArr[0] = "source";
                }
            } else {
                objArr[0] = "name";
            }
        } else {
            objArr[0] = "containingDeclaration";
        }
        if (i10 != 4) {
            if (i10 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
            } else {
                objArr[1] = "getSource";
            }
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Mf.AbstractC1004m
    public final Mf.V g() {
        Mf.V v10 = this.f14110k0;
        if (v10 != null) {
            return v10;
        }
        p0(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f14111l0;
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        AbstractC1003l abstractC1003l = this.f14109j0;
        if (abstractC1003l != null) {
            return abstractC1003l;
        }
        p0(4);
        throw null;
    }
}
