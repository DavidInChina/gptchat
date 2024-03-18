package ng;

import Bg.A;
import Bg.Y;
import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1006o;
import Mf.B;
import Mf.EnumC0998g;
import Mf.G;
import Mf.M;
import Mf.S;
import Mf.W;
import Mf.r;
import Pf.I;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Collection;
import java.util.LinkedHashSet;
import kg.AbstractC4296h;
import kg.C4291c;
import kg.C4293e;
import r9.y;

/* renamed from: ng.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4838e {

    /* renamed from: a */
    public static final /* synthetic */ int f40339a = 0;

    static {
        new C4291c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case y.f44626f /* 48 */:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case y.f44626f /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(AbstractC0993b abstractC0993b, LinkedHashSet linkedHashSet) {
        if (abstractC0993b != null) {
            if (linkedHashSet.contains(abstractC0993b)) {
                return;
            }
            for (AbstractC0993b abstractC0993b2 : abstractC0993b.mo24a().m()) {
                AbstractC0993b mo24a = abstractC0993b2.mo24a();
                b(mo24a, linkedHashSet);
                linkedHashSet.add(mo24a);
            }
            return;
        }
        a(73);
        throw null;
    }

    public static AbstractC0997f c(A a5) {
        if (a5 != null) {
            Y y02 = a5.y0();
            if (y02 != null) {
                AbstractC0997f abstractC0997f = (AbstractC0997f) y02.k();
                if (abstractC0997f != null) {
                    return abstractC0997f;
                }
                a(47);
                throw null;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static B d(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            B e10 = e(abstractC1003l);
            if (e10 != null) {
                return e10;
            }
            a(22);
            throw null;
        }
        a(21);
        throw null;
    }

    public static B e(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            while (abstractC1003l != null) {
                if (abstractC1003l instanceof B) {
                    return (B) abstractC1003l;
                }
                if (abstractC1003l instanceof M) {
                    return ((Pf.A) ((M) abstractC1003l)).f13975h0;
                }
                abstractC1003l = abstractC1003l.mo20k();
            }
            return null;
        }
        a(23);
        throw null;
    }

    public static W f(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            if (abstractC1003l instanceof S) {
                abstractC1003l = ((Pf.M) ((S) abstractC1003l)).w0();
            }
            boolean z10 = abstractC1003l instanceof AbstractC1004m;
            Cf.k kVar = W.f12076p;
            if (z10) {
                ((AbstractC1004m) abstractC1003l).g().getClass();
            }
            return kVar;
        }
        a(82);
        throw null;
    }

    public static C4293e g(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            C4291c h10 = h(abstractC1003l);
            if (h10 != null) {
                return h10.i();
            }
            return g(abstractC1003l.mo20k()).b(abstractC1003l.getName());
        }
        a(2);
        throw null;
    }

    public static C4291c h(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            if (!(abstractC1003l instanceof B) && !Dg.m.f(abstractC1003l)) {
                if (abstractC1003l instanceof M) {
                    return ((Pf.A) ((M) abstractC1003l)).f13976i0;
                }
                if (!(abstractC1003l instanceof G)) {
                    return null;
                }
                return ((I) ((G) abstractC1003l)).f14010j0;
            }
            return C4291c.f37496c;
        }
        a(5);
        throw null;
    }

    public static AbstractC1003l i(AbstractC1003l abstractC1003l, Class cls, boolean z10) {
        if (abstractC1003l == null) {
            return null;
        }
        if (z10) {
            abstractC1003l = abstractC1003l.mo20k();
        }
        while (abstractC1003l != null) {
            if (cls.isInstance(abstractC1003l)) {
                return abstractC1003l;
            }
            abstractC1003l = abstractC1003l.mo20k();
        }
        return null;
    }

    public static AbstractC0997f j(AbstractC0997f abstractC0997f) {
        if (abstractC0997f != null) {
            for (A a5 : abstractC0997f.f().l()) {
                AbstractC0997f c10 = c(a5);
                if (c10.e() != EnumC0998g.f12085Z) {
                    return c10;
                }
            }
            return null;
        }
        a(44);
        throw null;
    }

    public static boolean k(AbstractC1003l abstractC1003l) {
        if (n(abstractC1003l, EnumC0998g.f12084Y) && abstractC1003l.getName().equals(AbstractC4296h.f37511a)) {
            return true;
        }
        return false;
    }

    public static boolean l(AbstractC1003l abstractC1003l) {
        if (n(abstractC1003l, EnumC0998g.f12089k0) && ((AbstractC0997f) abstractC1003l).q()) {
            return true;
        }
        return false;
    }

    public static boolean m(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            return n(abstractC1003l, EnumC0998g.f12087i0);
        }
        a(36);
        throw null;
    }

    public static boolean n(AbstractC1003l abstractC1003l, EnumC0998g enumC0998g) {
        if ((abstractC1003l instanceof AbstractC0997f) && ((AbstractC0997f) abstractC1003l).e() == enumC0998g) {
            return true;
        }
        return false;
    }

    public static boolean o(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            while (abstractC1003l != null) {
                if (k(abstractC1003l) || ((abstractC1003l instanceof AbstractC1006o) && ((AbstractC1006o) abstractC1003l).getVisibility() == r.f12106f)) {
                    return true;
                }
                abstractC1003l = abstractC1003l.mo20k();
            }
            return false;
        }
        a(1);
        throw null;
    }

    public static boolean p(A a5, AbstractC0997f abstractC0997f) {
        if (a5 != null) {
            if (abstractC0997f != null) {
                AbstractC1000i k10 = a5.y0().k();
                if (k10 != null) {
                    AbstractC1003l mo24a = k10.mo24a();
                    if ((mo24a instanceof AbstractC1000i) && abstractC0997f.f().equals(((AbstractC1000i) mo24a).f())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }

    public static boolean q(AbstractC1001j abstractC1001j) {
        if ((n(abstractC1001j, EnumC0998g.f12084Y) || n(abstractC1001j, EnumC0998g.f12085Z)) && ((AbstractC0997f) abstractC1001j).h() == Mf.A.f12052h0) {
            return true;
        }
        return false;
    }

    public static boolean r(A a5, AbstractC0997f abstractC0997f) {
        if (a5 != null) {
            if (abstractC0997f != null) {
                if (p(a5, abstractC0997f)) {
                    return true;
                }
                for (A a10 : a5.y0().l()) {
                    if (r(a10, abstractC0997f)) {
                        return true;
                    }
                }
                return false;
            }
            a(33);
            throw null;
        }
        a(32);
        throw null;
    }

    public static boolean s(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null && (abstractC1003l.mo20k() instanceof G)) {
            return true;
        }
        return false;
    }

    public static AbstractC0994c t(AbstractC0994c abstractC0994c) {
        if (abstractC0994c != null) {
            while (abstractC0994c.e() == 2) {
                Collection m10 = abstractC0994c.m();
                if (!m10.isEmpty()) {
                    abstractC0994c = (AbstractC0994c) m10.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + abstractC0994c);
                }
            }
            return abstractC0994c;
        }
        a(59);
        throw null;
    }
}
