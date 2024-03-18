package Jf;

import Bg.A;
import Bg.C0213f;
import Bg.D;
import Bg.Y;
import Bg.d0;
import Bg.m0;
import Bg.o0;
import Bg.p0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.B;
import Mf.H;
import Mf.P;
import Mf.S;
import Pf.E;
import Pf.G;
import Pf.I;
import com.statsig.androidsdk.StatsigLoggerKt;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import ng.AbstractC4838e;
import r9.y;
import rg.AbstractC5493d;
import yg.C6586c;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: e */
    public static final C4294f f9117e = C4294f.g("<built-ins module>");

    /* renamed from: a */
    public G f9118a;

    /* renamed from: b */
    public final Ag.l f9119b;

    /* renamed from: c */
    public final Ag.n f9120c;

    /* renamed from: d */
    public final Ag.u f9121d;

    public l(Ag.q qVar) {
        this.f9121d = qVar;
        qVar.a(new h(this, 0));
        this.f9119b = new Ag.l(qVar, new h(this, 1));
        this.f9120c = qVar.b(new i(0, this));
    }

    public static boolean A(A a5, C4293e c4293e) {
        if (a5 != null) {
            if (c4293e != null) {
                return G(a5.y0(), c4293e);
            }
            a(99);
            throw null;
        }
        a(98);
        throw null;
    }

    public static boolean B(A a5, C4293e c4293e) {
        if (c4293e != null) {
            if (A(a5, c4293e) && !a5.z0()) {
                return true;
            }
            return false;
        }
        a(136);
        throw null;
    }

    public static boolean C(AbstractC1013w abstractC1013w) {
        if (abstractC1013w.mo24a().getAnnotations().G(p.f9180m)) {
            return true;
        }
        if (!(abstractC1013w instanceof P)) {
            return false;
        }
        P p10 = (P) abstractC1013w;
        boolean Y7 = p10.Y();
        Pf.P d10 = p10.d();
        S b10 = p10.b();
        if (d10 != null && C(d10)) {
            if (!Y7) {
                return true;
            }
            if (b10 != null && C(b10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(A a5, C4293e c4293e) {
        if (c4293e != null) {
            if (!a5.z0() && A(a5, c4293e)) {
                return true;
            }
            return false;
        }
        a(107);
        throw null;
    }

    public static boolean E(A a5) {
        if (a5 != null) {
            if (a5 != null) {
                if (A(a5, p.f9167b) && !m0.f(a5)) {
                    return true;
                }
                return false;
            }
            a(139);
            throw null;
        }
        a(137);
        throw null;
    }

    public static boolean F(A a5) {
        if (a5 != null) {
            if (!a5.z0()) {
                AbstractC1000i k10 = a5.y0().k();
                if (k10 instanceof AbstractC0997f) {
                    AbstractC0997f abstractC0997f = (AbstractC0997f) k10;
                    if (abstractC0997f != null) {
                        if (t(abstractC0997f) != null) {
                            return true;
                        }
                    } else {
                        a(97);
                        throw null;
                    }
                }
            }
            return false;
        }
        a(95);
        throw null;
    }

    public static boolean G(Y y10, C4293e c4293e) {
        if (y10 != null) {
            if (c4293e != null) {
                AbstractC1000i k10 = y10.k();
                if ((k10 instanceof AbstractC0997f) && b(k10, c4293e)) {
                    return true;
                }
                return false;
            }
            a(103);
            throw null;
        }
        a(102);
        throw null;
    }

    public static boolean H(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            while (abstractC1003l != null) {
                if (abstractC1003l instanceof Mf.G) {
                    return ((I) ((Mf.G) abstractC1003l)).f14010j0.h(q.f9203j);
                }
                abstractC1003l = abstractC1003l.mo20k();
            }
            return false;
        }
        a(10);
        throw null;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case y.f44626f /* 48 */:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case y.f44626f /* 48 */:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case y.f44626f /* 48 */:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case y.f44626f /* 48 */:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case y.f44626f /* 48 */:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case y.f44626f /* 48 */:
            case 49:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(AbstractC1000i abstractC1000i, C4293e c4293e) {
        if (abstractC1000i != null) {
            if (c4293e != null) {
                if (abstractC1000i.getName().equals(c4293e.f()) && c4293e.equals(AbstractC4838e.g(abstractC1000i))) {
                    return true;
                }
                return false;
            }
            a(105);
            throw null;
        }
        a(104);
        throw null;
    }

    public static n r(AbstractC1000i abstractC1000i) {
        if (abstractC1000i != null) {
            if (!p.f9166a0.contains(abstractC1000i.getName())) {
                return null;
            }
            return (n) p.f9170c0.get(AbstractC4838e.g(abstractC1000i));
        }
        a(78);
        throw null;
    }

    public static n t(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            if (!p.f9164Z.contains(abstractC1003l.getName())) {
                return null;
            }
            return (n) p.f9168b0.get(AbstractC4838e.g(abstractC1003l));
        }
        a(77);
        throw null;
    }

    public static boolean x(A a5) {
        if (a5 != null) {
            return A(a5, p.f9165a);
        }
        a(140);
        throw null;
    }

    public static boolean y(A a5) {
        if (a5 != null) {
            return A(a5, p.f9174g);
        }
        a(89);
        throw null;
    }

    public static boolean z(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            if (AbstractC4838e.i(abstractC1003l, d.class, false) == null) {
                return false;
            }
            return true;
        }
        a(9);
        throw null;
    }

    public final void c(boolean z10) {
        C4294f c4294f = f9117e;
        AbstractC3557B.c0("moduleName", c4294f);
        Ag.u uVar = this.f9121d;
        AbstractC3557B.c0("storageManager", uVar);
        G g10 = new G(c4294f, uVar, this, 48);
        this.f9118a = g10;
        c.f9103a.getClass();
        H a5 = ((C6586c) ((c) b.f9102b.getValue())).a(this.f9121d, this.f9118a, l(), p(), d(), z10);
        AbstractC3557B.c0("providerForModuleContent", a5);
        g10.f13998m0 = a5;
        G g11 = this.f9118a;
        g11.getClass();
        g11.f13997l0 = new E(kf.q.z3(new G[]{g11}));
    }

    public Of.b d() {
        return Of.a.f13750a;
    }

    public final D e() {
        D n10 = j("Any").n();
        if (n10 != null) {
            return n10;
        }
        a(51);
        throw null;
    }

    public final A f(A a5) {
        B b10;
        C4290b f6;
        C4290b c4290b;
        AbstractC0997f s02;
        D d10 = null;
        if (a5 != null) {
            if (y(a5)) {
                if (a5.w0().size() == 1) {
                    A type = ((d0) a5.w0().get(0)).getType();
                    if (type != null) {
                        return type;
                    }
                    a(69);
                    throw null;
                }
                throw new IllegalStateException();
            }
            o0 h10 = m0.h(a5, false);
            A a10 = (A) ((k) this.f9119b.mo122invoke()).f9116c.get(h10);
            if (a10 != null) {
                return a10;
            }
            int i10 = AbstractC4838e.f40339a;
            AbstractC1000i k10 = h10.y0().k();
            if (k10 == null) {
                b10 = null;
            } else {
                b10 = AbstractC4838e.e(k10);
            }
            if (b10 != null) {
                AbstractC1000i k11 = h10.y0().k();
                if (k11 != null) {
                    Set set = u.f9221a;
                    C4294f name = k11.getName();
                    AbstractC3557B.c0("name", name);
                    if (u.f9224d.contains(name) && (f6 = AbstractC5493d.f(k11)) != null && (c4290b = (C4290b) u.f9222b.get(f6)) != null && (s02 = R4.b.s0(b10, c4290b)) != null) {
                        d10 = s02.n();
                    }
                }
                if (d10 != null) {
                    return d10;
                }
            }
            throw new IllegalStateException("not array: " + a5);
        }
        a(68);
        throw null;
    }

    public final D g(o0 o0Var) {
        p0 p0Var = p0.f2146h0;
        if (o0Var != null) {
            return h(p0Var, o0Var, Nf.h.f12822a);
        }
        a(84);
        throw null;
    }

    public final D h(p0 p0Var, A a5, Nf.i iVar) {
        if (a5 != null) {
            return C0213f.l(A7.b.P1(iVar), j("Array"), Collections.singletonList(new Bg.I(a5, p0Var)));
        }
        a(80);
        throw null;
    }

    public final AbstractC0997f i(C4291c c4291c) {
        if (c4291c != null) {
            G k10 = k();
            Tf.d dVar = Tf.d.f17211Y;
            AbstractC0997f A02 = P4.a.A0(k10, c4291c);
            if (A02 != null) {
                return A02;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final AbstractC0997f j(String str) {
        if (str != null) {
            return (AbstractC0997f) this.f9120c.invoke(C4294f.e(str));
        }
        a(14);
        throw null;
    }

    public final G k() {
        this.f9118a.getClass();
        G g10 = this.f9118a;
        if (g10 != null) {
            return g10;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List singletonList = Collections.singletonList(new Kf.a(this.f9121d, k()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final D m() {
        D o10 = o();
        if (o10 != null) {
            return o10;
        }
        a(53);
        throw null;
    }

    public final D n() {
        D n10 = j("Nothing").n();
        if (n10 != null) {
            return n10;
        }
        a(49);
        throw null;
    }

    public final D o() {
        D C02 = e().C0(true);
        if (C02 != null) {
            return C02;
        }
        a(52);
        throw null;
    }

    public Of.e p() {
        return Of.d.f13752a;
    }

    public final D q(n nVar) {
        if (nVar != null) {
            D d10 = (D) ((k) this.f9119b.mo122invoke()).f9114a.get(nVar);
            if (d10 != null) {
                return d10;
            }
            a(75);
            throw null;
        }
        a(74);
        throw null;
    }

    public final D s(n nVar) {
        if (nVar != null) {
            if (nVar != null) {
                D n10 = j(nVar.f9134Y.b()).n();
                if (n10 != null) {
                    return n10;
                }
                a(55);
                throw null;
            }
            a(16);
            throw null;
        }
        a(54);
        throw null;
    }

    public final D u() {
        D n10 = j("String").n();
        if (n10 != null) {
            return n10;
        }
        a(66);
        throw null;
    }

    public final AbstractC0997f v(int i10) {
        C4291c c4291c = q.f9199f;
        AbstractC0997f i11 = i(c4291c.c(C4294f.e(Kf.j.f9804c.f9806b + i10)));
        if (i11 != null) {
            return i11;
        }
        a(18);
        throw null;
    }

    public final D w() {
        D n10 = j("Unit").n();
        if (n10 != null) {
            return n10;
        }
        a(65);
        throw null;
    }
}
