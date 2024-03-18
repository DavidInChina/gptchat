package Bg;

import Mf.AbstractC0997f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4293e;
import ng.AbstractC4838e;

/* renamed from: Bg.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0221n extends AbstractC0209b {

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0997f f2142c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2143d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection f2144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0221n(AbstractC0997f abstractC0997f, List list, Collection collection, Ag.u uVar) {
        super(uVar);
        if (abstractC0997f != null) {
            if (list != null) {
                if (collection != null) {
                    if (uVar != null) {
                        this.f2142c = abstractC0997f;
                        this.f2143d = Collections.unmodifiableList(new ArrayList(list));
                        this.f2144e = Collections.unmodifiableCollection(collection);
                        return;
                    }
                    p(3);
                    throw null;
                }
                p(2);
                throw null;
            }
            p(1);
            throw null;
        }
        p(0);
        throw null;
    }

    public static /* synthetic */ void p(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                    } else {
                        objArr[1] = "getSupertypeLoopChecker";
                    }
                } else {
                    objArr[1] = "computeSupertypes";
                }
            } else {
                objArr[1] = "getDeclarationDescriptor";
            }
        } else {
            objArr[1] = "getParameters";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Bg.AbstractC0218k
    public final Collection b() {
        Collection collection = this.f2144e;
        if (collection != null) {
            return collection;
        }
        p(6);
        throw null;
    }

    @Override // Bg.AbstractC0218k
    public final Mf.Z f() {
        return Mf.Y.f12077a;
    }

    @Override // Bg.Y
    public final List getParameters() {
        List list = this.f2143d;
        if (list != null) {
            return list;
        }
        p(4);
        throw null;
    }

    @Override // Bg.Y
    public final boolean m() {
        return true;
    }

    @Override // Bg.AbstractC0209b
    public final AbstractC0997f q() {
        AbstractC0997f abstractC0997f = this.f2142c;
        if (abstractC0997f != null) {
            return abstractC0997f;
        }
        p(5);
        throw null;
    }

    public final String toString() {
        String str = AbstractC4838e.g(this.f2142c).f37503a;
        if (str != null) {
            return str;
        }
        C4293e.a(4);
        throw null;
    }
}
