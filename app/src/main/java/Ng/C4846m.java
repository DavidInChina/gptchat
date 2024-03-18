package ng;

import Bg.A;
import Bg.C0213f;
import Bg.X;
import K4.J;
import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1006o;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.P;
import Mf.S;
import Mf.b0;
import Mf.h0;
import Mf.r;
import Pf.AbstractC1146d;
import Pf.AbstractC1165x;
import Pf.M;
import Pf.O;
import Pf.c0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.statsig.androidsdk.StatsigLoggerKt;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kf.t;
import kg.C4292d;
import kg.C4294f;
import r9.y;
import rg.AbstractC5493d;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* renamed from: ng.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4846m {

    /* renamed from: c  reason: collision with root package name */
    public static final List f40355c = t.K2(ServiceLoader.load(AbstractC4841h.class, AbstractC4841h.class.getClassLoader()));

    /* renamed from: d  reason: collision with root package name */
    public static final C4846m f40356d;

    /* renamed from: e  reason: collision with root package name */
    public static final C3422a f40357e;

    /* renamed from: a  reason: collision with root package name */
    public final Cg.i f40358a;

    /* renamed from: b  reason: collision with root package name */
    public final Cg.c f40359b;

    static {
        C3422a c3422a = new C3422a(4);
        f40357e = c3422a;
        f40356d = new C4846m(c3422a);
    }

    public C4846m(Cg.c cVar) {
        Cg.h hVar = Cg.h.f3127a;
        if (cVar != null) {
            this.f40359b = cVar;
            this.f40358a = hVar;
            return;
        }
        a(5);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
            }
            if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                switch (i10) {
                    default:
                        switch (i10) {
                            default:
                                switch (i10) {
                                    default:
                                        switch (i10) {
                                            case 90:
                                            case 91:
                                            case 92:
                                                break;
                                            default:
                                                i11 = 3;
                                                break;
                                        }
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                        i11 = 2;
                                        break;
                                }
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                }
                objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 30:
                    case 40:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 31:
                    case 41:
                        objArr[0] = "subDescriptor";
                        break;
                    case 42:
                        objArr[0] = "firstParameters";
                        break;
                    case 43:
                        objArr[0] = "secondParameters";
                        break;
                    case 46:
                        objArr[0] = "typeInSuper";
                        break;
                    case 47:
                        objArr[0] = "typeInSub";
                        break;
                    case y.f44626f /* 48 */:
                    case 51:
                    case 77:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 49:
                        objArr[0] = "superTypeParameter";
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 52:
                        objArr[0] = "name";
                        break;
                    case 53:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 54:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 55:
                    case 61:
                    case 64:
                    case 86:
                    case 89:
                    case 96:
                        objArr[0] = "current";
                        break;
                    case 56:
                    case 62:
                    case 66:
                    case 87:
                    case 106:
                        objArr[0] = "strategy";
                        break;
                    case 57:
                        objArr[0] = "overriding";
                        break;
                    case 58:
                        objArr[0] = "fromSuper";
                        break;
                    case 59:
                        objArr[0] = "fromCurrent";
                        break;
                    case 60:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 63:
                    case 65:
                        objArr[0] = "notOverridden";
                        break;
                    case 67:
                    case 69:
                    case 73:
                        objArr[0] = "a";
                        break;
                    case 68:
                    case 70:
                    case 75:
                        objArr[0] = "b";
                        break;
                    case 71:
                        objArr[0] = "candidate";
                        break;
                    case 72:
                    case 88:
                    case 93:
                    case 109:
                        objArr[0] = "descriptors";
                        break;
                    case 74:
                        objArr[0] = "aReturnType";
                        break;
                    case 76:
                        objArr[0] = "bReturnType";
                        break;
                    case 78:
                    case 85:
                        objArr[0] = "overridables";
                        break;
                    case 79:
                    case 101:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 94:
                        objArr[0] = "classModality";
                        break;
                    case 97:
                        objArr[0] = "toFilter";
                        break;
                    case 99:
                    case 104:
                        objArr[0] = "overrider";
                        break;
                    case 100:
                    case 105:
                        objArr[0] = "extractFrom";
                        break;
                    case 102:
                        objArr[0] = "onConflict";
                        break;
                    case 107:
                    case 108:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i10 == 11 && i10 != 12) {
                    if (i10 != 16) {
                        if (i10 != 21) {
                            if (i10 != 95) {
                                if (i10 != 98) {
                                    if (i10 != 103) {
                                        if (i10 != 44 && i10 != 45) {
                                            switch (i10) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                        case 35:
                                                        case 36:
                                                        case 37:
                                                        case 38:
                                                        case 39:
                                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                                            break;
                                                        default:
                                                            switch (i10) {
                                                                case 80:
                                                                case 81:
                                                                case 82:
                                                                case 83:
                                                                case 84:
                                                                    objArr[1] = "selectMostSpecificMember";
                                                                    break;
                                                                default:
                                                                    switch (i10) {
                                                                        case 90:
                                                                        case 91:
                                                                        case 92:
                                                                            objArr[1] = "determineModalityForFakeOverride";
                                                                            break;
                                                                        default:
                                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        } else {
                                            objArr[1] = "createTypeCheckerState";
                                        }
                                    } else {
                                        objArr[1] = "extractMembersOverridableInBothWays";
                                    }
                                } else {
                                    objArr[1] = "filterVisibleFakeOverrides";
                                }
                            } else {
                                objArr[1] = "getMinimalModality";
                            }
                        }
                        objArr[1] = "isOverridableBy";
                    } else {
                        objArr[1] = "getOverriddenDeclarations";
                    }
                } else {
                    objArr[1] = "filterOverrides";
                }
                switch (i10) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 44:
                    case 45:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 98:
                    case 103:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 42:
                    case 43:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 46:
                    case 47:
                    case y.f44626f /* 48 */:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 49:
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                    case 51:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 57:
                    case 58:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 63:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 64:
                    case 65:
                    case 66:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 71:
                    case 72:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 78:
                    case 79:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 85:
                    case 86:
                    case 87:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 88:
                    case 89:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 93:
                    case 94:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 96:
                    case 97:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 104:
                    case 105:
                    case 106:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 107:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 108:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 109:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
                    switch (i10) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            switch (i10) {
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                    break;
                                default:
                                    switch (i10) {
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                            break;
                                        default:
                                            switch (i10) {
                                                case 90:
                                                case 91:
                                                case 92:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format2 = String.format(str, objArr);
            if (i10 != 11) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 11) {
            switch (i10) {
            }
            objArr = new Object[i11];
            switch (i10) {
            }
            if (i10 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i10) {
            }
            String format22 = String.format(str, objArr);
            if (i10 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
        }
        if (i10 == 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i10) {
        }
        String format222 = String.format(str, objArr);
        if (i10 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(A a5, A a10, X x10) {
        if (a5 != null) {
            if (a10 != null) {
                if (Bi.c.g1(a5) && Bi.c.g1(a10)) {
                    return true;
                }
                return C0213f.e(x10, a5.B0(), a10.B0());
            }
            a(47);
            throw null;
        }
        a(46);
        throw null;
    }

    public static void c(AbstractC0994c abstractC0994c, LinkedHashSet linkedHashSet) {
        if (abstractC0994c != null) {
            if (abstractC0994c.e() != 2) {
                linkedHashSet.add(abstractC0994c);
                return;
            } else if (!abstractC0994c.m().isEmpty()) {
                for (AbstractC0994c abstractC0994c2 : abstractC0994c.m()) {
                    c(abstractC0994c2, linkedHashSet);
                }
                return;
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + abstractC0994c);
            }
        }
        a(17);
        throw null;
    }

    public static ArrayList d(AbstractC0993b abstractC0993b) {
        AbstractC1146d Z10 = abstractC0993b.Z();
        ArrayList arrayList = new ArrayList();
        if (Z10 != null) {
            arrayList.add(Z10.getType());
        }
        for (h0 h0Var : abstractC0993b.S()) {
            arrayList.add(((c0) h0Var).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
        if (r2 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014f, code lost:
        r1 = Mf.r.f12108h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0152, code lost:
        r1 = Mf.r.f12107g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
        r12 = ((Mf.AbstractC0994c) s(r11, new kg.C4292d(1))).D(r12, r0, r1);
        r13.a0(r12, r11);
        r13.g(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0169, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Collection collection, AbstractC0997f abstractC0997f, J j6) {
        Mf.A a5;
        Mf.A a10;
        Mf.A a11;
        if (collection != null) {
            if (abstractC0997f != null) {
                ArrayList b22 = t.b2(collection, new Jf.i(4, abstractC0997f));
                boolean isEmpty = b22.isEmpty();
                if (!isEmpty) {
                    collection = b22;
                }
                Iterator it = collection.iterator();
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    if (it.hasNext()) {
                        AbstractC0994c abstractC0994c = (AbstractC0994c) it.next();
                        int ordinal = abstractC0994c.h().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        z12 = true;
                                    }
                                } else {
                                    z11 = true;
                                }
                            } else {
                                throw new IllegalStateException("Member cannot have SEALED modality: " + abstractC0994c);
                            }
                        } else {
                            a5 = Mf.A.f12051Z;
                            break;
                        }
                    } else {
                        if (abstractC0997f.H() && abstractC0997f.h() != Mf.A.f12054j0 && abstractC0997f.h() != Mf.A.f12052h0) {
                            z10 = true;
                        }
                        if (z11 && !z12) {
                            a5 = Mf.A.f12053i0;
                        } else if (!z11 && z12) {
                            if (z10) {
                                a11 = abstractC0997f.h();
                            } else {
                                a11 = Mf.A.f12054j0;
                            }
                            if (a11 != null) {
                                a5 = a11;
                            } else {
                                a(92);
                                throw null;
                            }
                        } else {
                            HashSet<AbstractC0994c> hashSet = new HashSet();
                            for (AbstractC0994c abstractC0994c2 : collection) {
                                if (abstractC0994c2 != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    c(abstractC0994c2, linkedHashSet);
                                    hashSet.addAll(linkedHashSet);
                                } else {
                                    a(15);
                                    throw null;
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                AbstractC2469q0.p(AbstractC5493d.j((AbstractC1003l) hashSet.iterator().next()).s0(Cg.j.f3128a));
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            AbstractC0993b abstractC0993b = (AbstractC0993b) next;
                                            AbstractC0993b abstractC0993b2 = (AbstractC0993b) it3.next();
                                            if (q(abstractC0993b, abstractC0993b2)) {
                                                it3.remove();
                                            } else if (q(abstractC0993b2, abstractC0993b)) {
                                                break;
                                            }
                                        } else {
                                            linkedHashSet2.add(next);
                                            break;
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            Mf.A h10 = abstractC0997f.h();
                            if (h10 != null) {
                                Mf.A a12 = Mf.A.f12054j0;
                                for (AbstractC0994c abstractC0994c3 : hashSet) {
                                    if (z10 && abstractC0994c3.h() == Mf.A.f12054j0) {
                                        a10 = h10;
                                    } else {
                                        a10 = abstractC0994c3.h();
                                    }
                                    if (a10.compareTo(a12) < 0) {
                                        a12 = a10;
                                    }
                                }
                                if (a12 != null) {
                                    a5 = a12;
                                } else {
                                    a(95);
                                    throw null;
                                }
                            } else {
                                a(94);
                                throw null;
                            }
                        }
                    }
                }
            } else {
                a(86);
                throw null;
            }
        } else {
            a(85);
            throw null;
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, wf.k kVar, wf.k kVar2) {
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            AbstractC0993b abstractC0993b = (AbstractC0993b) kVar.invoke(obj);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC0993b abstractC0993b2 = (AbstractC0993b) kVar.invoke(next);
                if (obj == next) {
                    it.remove();
                } else {
                    int j6 = j(abstractC0993b, abstractC0993b2);
                    if (j6 == 1) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j6 == 3) {
                        kVar2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        a(99);
        throw null;
    }

    public static C4845l i(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        boolean z10;
        boolean z11;
        C4845l c4845l;
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                boolean z12 = abstractC0993b instanceof AbstractC1013w;
                if ((z12 && !(abstractC0993b2 instanceof AbstractC1013w)) || (((z10 = abstractC0993b instanceof P)) && !(abstractC0993b2 instanceof P))) {
                    return C4845l.d("Member kind mismatch");
                }
                if (!z12 && !z10) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + abstractC0993b);
                } else if (!abstractC0993b.getName().equals(abstractC0993b2.getName())) {
                    return C4845l.d("Name mismatch");
                } else {
                    boolean z13 = false;
                    if (abstractC0993b.Z() == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (abstractC0993b2.Z() == null) {
                        z13 = true;
                    }
                    if (z11 != z13) {
                        c4845l = C4845l.d("Receiver presence mismatch");
                    } else if (abstractC0993b.S().size() != abstractC0993b2.S().size()) {
                        c4845l = C4845l.d("Value parameter number mismatch");
                    } else {
                        c4845l = null;
                    }
                    if (c4845l == null) {
                        return null;
                    }
                    return c4845l;
                }
            }
            a(41);
            throw null;
        }
        a(40);
        throw null;
    }

    public static int j(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        C4846m c4846m = f40356d;
        int c10 = c4846m.l(abstractC0993b2, abstractC0993b, null).c();
        int c11 = c4846m.l(abstractC0993b, abstractC0993b2, null).c();
        if (c10 == 1 && c11 == 1) {
            return 1;
        }
        if (c10 == 3 || c11 == 3) {
            return 3;
        }
        return 2;
    }

    public static boolean k(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                A returnType = abstractC0993b.getReturnType();
                A returnType2 = abstractC0993b2.getReturnType();
                if (!p(abstractC0993b, abstractC0993b2)) {
                    return false;
                }
                X f6 = f40356d.f(abstractC0993b.getTypeParameters(), abstractC0993b2.getTypeParameters());
                if (abstractC0993b instanceof AbstractC1013w) {
                    return o(abstractC0993b, returnType, abstractC0993b2, returnType2, f6);
                }
                if (abstractC0993b instanceof P) {
                    P p10 = (P) abstractC0993b;
                    P p11 = (P) abstractC0993b2;
                    S b10 = p10.b();
                    S b11 = p11.b();
                    if (b10 != null && b11 != null && !p(b10, b11)) {
                        return false;
                    }
                    if (p10.Y() && p11.Y()) {
                        return C0213f.e(f6, returnType.B0(), returnType2.B0());
                    }
                    if ((!p10.Y() && p11.Y()) || !o(abstractC0993b, returnType, abstractC0993b2, returnType2, f6)) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Unexpected callable: " + abstractC0993b.getClass());
            }
            a(68);
            throw null;
        }
        a(67);
        throw null;
    }

    public static boolean o(AbstractC0993b abstractC0993b, A a5, AbstractC0993b abstractC0993b2, A a10, X x10) {
        if (abstractC0993b != null) {
            if (a5 != null) {
                if (abstractC0993b2 != null) {
                    if (a10 != null) {
                        return C0213f.j(C0213f.f2118a, x10, a5.B0(), a10.B0());
                    }
                    a(76);
                    throw null;
                }
                a(75);
                throw null;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public static boolean p(AbstractC1006o abstractC1006o, AbstractC1006o abstractC1006o2) {
        if (abstractC1006o != null) {
            if (abstractC1006o2 != null) {
                Integer b10 = r.b(abstractC1006o.getVisibility(), abstractC1006o2.getVisibility());
                if (b10 != null && b10.intValue() < 0) {
                    return false;
                }
                return true;
            }
            a(70);
            throw null;
        }
        a(69);
        throw null;
    }

    public static boolean q(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                boolean equals = abstractC0993b.equals(abstractC0993b2);
                C4836c c4836c = C4836c.f40338a;
                if (!equals && c4836c.a(abstractC0993b.mo24a(), abstractC0993b2.mo24a(), false, true)) {
                    return true;
                }
                AbstractC0993b mo24a = abstractC0993b2.mo24a();
                int i10 = AbstractC4838e.f40339a;
                LinkedHashSet<AbstractC0993b> linkedHashSet = new LinkedHashSet();
                AbstractC4838e.b(abstractC0993b.mo24a(), linkedHashSet);
                for (AbstractC0993b abstractC0993b3 : linkedHashSet) {
                    if (c4836c.a(mo24a, abstractC0993b3, false, true)) {
                        return true;
                    }
                }
                return false;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(AbstractC0994c abstractC0994c, wf.k kVar) {
        AbstractC1007p abstractC1007p;
        AbstractC1007p abstractC1007p2;
        wf.k kVar2;
        AbstractC1007p abstractC1007p3;
        if (abstractC0994c != null) {
            for (AbstractC0994c abstractC0994c2 : abstractC0994c.m()) {
                if (abstractC0994c2.getVisibility() == r.f12107g) {
                    r(abstractC0994c2, kVar);
                }
            }
            if (abstractC0994c.getVisibility() != r.f12107g) {
                return;
            }
            Collection<AbstractC0994c> m10 = abstractC0994c.m();
            if (m10 != null) {
                if (m10.isEmpty()) {
                    abstractC1007p = r.f12111k;
                } else {
                    loop1: while (true) {
                        abstractC1007p3 = null;
                        for (AbstractC0994c abstractC0994c3 : m10) {
                            AbstractC1007p visibility = abstractC0994c3.getVisibility();
                            if (abstractC1007p3 != null) {
                                Integer b10 = r.b(visibility, abstractC1007p3);
                                if (b10 == null) {
                                    break;
                                } else if (b10.intValue() > 0) {
                                }
                            }
                            abstractC1007p3 = visibility;
                        }
                    }
                    if (abstractC1007p3 != null) {
                        for (AbstractC0994c abstractC0994c4 : m10) {
                            Integer b11 = r.b(abstractC1007p3, abstractC0994c4.getVisibility());
                            if (b11 != null) {
                                if (b11.intValue() < 0) {
                                }
                            }
                        }
                        abstractC1007p = abstractC1007p3;
                    }
                    abstractC1007p = null;
                    break;
                }
                if (abstractC1007p != null) {
                    if (abstractC0994c.e() == 2) {
                        for (AbstractC0994c abstractC0994c5 : m10) {
                            if (abstractC0994c5.h() == Mf.A.f12054j0 || abstractC0994c5.getVisibility().equals(abstractC1007p)) {
                            }
                        }
                    } else {
                        abstractC1007p = r.g(abstractC1007p.f12097a.c());
                    }
                    if (abstractC1007p != null) {
                        if (kVar != null) {
                            kVar.invoke(abstractC0994c);
                        }
                        abstractC1007p2 = r.f12105e;
                    } else {
                        abstractC1007p2 = abstractC1007p;
                    }
                    if (!(abstractC0994c instanceof O)) {
                        O o10 = (O) abstractC0994c;
                        if (abstractC1007p2 != null) {
                            o10.f14045o0 = abstractC1007p2;
                            Iterator it = ((P) abstractC0994c).p().iterator();
                            while (it.hasNext()) {
                                Mf.O o11 = (Mf.O) it.next();
                                if (abstractC1007p == null) {
                                    kVar2 = null;
                                } else {
                                    kVar2 = kVar;
                                }
                                r(o11, kVar2);
                            }
                            return;
                        }
                        O.C(20);
                        throw null;
                    } else if (abstractC0994c instanceof AbstractC1165x) {
                        AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC0994c;
                        if (abstractC1007p2 != null) {
                            abstractC1165x.f14176q0 = abstractC1007p2;
                            return;
                        } else {
                            AbstractC1165x.C(10);
                            throw null;
                        }
                    } else {
                        M m11 = (M) abstractC0994c;
                        m11.f14022p0 = abstractC1007p2;
                        if (abstractC1007p2 != m11.w0().getVisibility()) {
                            m11.f14016j0 = false;
                            return;
                        }
                        return;
                    }
                }
                abstractC1007p = null;
                if (abstractC1007p != null) {
                }
                if (!(abstractC0994c instanceof O)) {
                }
            } else {
                a(109);
                throw null;
            }
        } else {
            a(107);
            throw null;
        }
    }

    public static Object s(Collection collection, wf.k kVar) {
        Object obj;
        if (collection.size() == 1) {
            Object e22 = t.e2(collection);
            if (e22 != null) {
                return e22;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(collection, 10));
        for (Object obj2 : collection) {
            arrayList2.add(kVar.invoke(obj2));
        }
        Object e23 = t.e2(collection);
        AbstractC0993b abstractC0993b = (AbstractC0993b) kVar.invoke(e23);
        for (Object obj3 : collection) {
            AbstractC0993b abstractC0993b2 = (AbstractC0993b) kVar.invoke(obj3);
            if (abstractC0993b2 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!k(abstractC0993b2, (AbstractC0993b) it.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(obj3);
                        break;
                    }
                }
                if (k(abstractC0993b2, abstractC0993b) && !k(abstractC0993b, abstractC0993b2)) {
                    e23 = obj3;
                }
            } else {
                a(71);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (e23 != null) {
                return e23;
            }
            a(81);
            throw null;
        } else if (arrayList.size() == 1) {
            Object e24 = t.e2(arrayList);
            if (e24 != null) {
                return e24;
            }
            a(82);
            throw null;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (!Ad.l.I0(((AbstractC0993b) kVar.invoke(obj)).getReturnType())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                return obj;
            }
            Object e25 = t.e2(arrayList);
            if (e25 != null) {
                return e25;
            }
            a(84);
            throw null;
        }
    }

    public final X f(List list, List list2) {
        if (list != null) {
            if (list2 != null) {
                boolean isEmpty = list.isEmpty();
                Cg.i iVar = this.f40358a;
                Cg.c cVar = this.f40359b;
                if (isEmpty) {
                    C4847n c4847n = new C4847n(null, cVar, iVar);
                    Cg.g gVar = c4847n.f40363d;
                    AbstractC3557B.c0("kotlinTypePreparator", gVar);
                    Cg.i iVar2 = c4847n.f40362c;
                    AbstractC3557B.c0("kotlinTypeRefiner", iVar2);
                    return new X(true, true, c4847n, gVar, iVar2);
                }
                HashMap hashMap = new HashMap();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    hashMap.put(((b0) list.get(i10)).f(), ((b0) list2.get(i10)).f());
                }
                C4847n c4847n2 = new C4847n(hashMap, cVar, iVar);
                Cg.g gVar2 = c4847n2.f40363d;
                AbstractC3557B.c0("kotlinTypePreparator", gVar2);
                Cg.i iVar3 = c4847n2.f40362c;
                AbstractC3557B.c0("kotlinTypeRefiner", iVar3);
                return new X(true, true, c4847n2, gVar2, iVar3);
            }
            a(43);
            throw null;
        }
        a(42);
        throw null;
    }

    public final void h(C4294f c4294f, Collection collection, Collection collection2, AbstractC0997f abstractC0997f, J j6) {
        Integer b10;
        boolean z10;
        if (c4294f != null) {
            if (collection != null) {
                if (collection2 != null) {
                    if (abstractC0997f != null) {
                        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet(collection);
                        Iterator it = collection2.iterator();
                        while (it.hasNext()) {
                            AbstractC0994c abstractC0994c = (AbstractC0994c) it.next();
                            if (abstractC0994c != null) {
                                ArrayList arrayList = new ArrayList(collection.size());
                                Collection gVar = new Ig.g();
                                Iterator it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    AbstractC0994c abstractC0994c2 = (AbstractC0994c) it2.next();
                                    int c10 = l(abstractC0994c2, abstractC0994c, abstractC0997f).c();
                                    if (!r.e(abstractC0994c2.getVisibility()) && r.c(r.f12113m, abstractC0994c2, abstractC0994c) == null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    int f6 = AbstractC6708l.f(c10);
                                    if (f6 != 0) {
                                        if (f6 == 2) {
                                            if (z10) {
                                                j6.n(abstractC0994c2, abstractC0994c);
                                            }
                                            arrayList.add(abstractC0994c2);
                                        }
                                    } else {
                                        if (z10) {
                                            gVar.add(abstractC0994c2);
                                        }
                                        arrayList.add(abstractC0994c2);
                                    }
                                }
                                j6.a0(abstractC0994c, gVar);
                                linkedHashSet.removeAll(arrayList);
                            } else {
                                a(59);
                                throw null;
                            }
                        }
                        if (linkedHashSet.size() >= 2) {
                            Jf.i iVar = new Jf.i(3, ((AbstractC0994c) linkedHashSet.iterator().next()).mo20k());
                            if (!linkedHashSet.isEmpty()) {
                                for (Object obj : linkedHashSet) {
                                    if (!((Boolean) iVar.invoke(obj)).booleanValue()) {
                                        LinkedList<AbstractC0994c> linkedList = new LinkedList(linkedHashSet);
                                        while (!linkedList.isEmpty()) {
                                            linkedList.isEmpty();
                                            AbstractC0994c abstractC0994c3 = null;
                                            for (AbstractC0994c abstractC0994c4 : linkedList) {
                                                if (abstractC0994c3 == null || ((b10 = r.b(abstractC0994c3.getVisibility(), abstractC0994c4.getVisibility())) != null && b10.intValue() < 0)) {
                                                    abstractC0994c3 = abstractC0994c4;
                                                }
                                            }
                                            AbstractC3557B.Z(abstractC0994c3);
                                            e(g(abstractC0994c3, linkedList, new C4292d(2), new C4844k(j6, abstractC0994c3)), abstractC0997f, j6);
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            e(Collections.singleton((AbstractC0994c) it3.next()), abstractC0997f, j6);
                        }
                        return;
                    }
                    a(55);
                    throw null;
                }
                a(54);
                throw null;
            }
            a(53);
            throw null;
        }
        a(52);
        throw null;
    }

    public final C4845l l(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, AbstractC0997f abstractC0997f) {
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                C4845l m10 = m(abstractC0993b, abstractC0993b2, abstractC0997f, false);
                if (m10 != null) {
                    return m10;
                }
                a(21);
                throw null;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public final C4845l m(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, AbstractC0997f abstractC0997f, boolean z10) {
        boolean z11;
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                C4845l n10 = n(abstractC0993b, abstractC0993b2, z10);
                if (n10.c() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                List<AbstractC4841h> list = f40355c;
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    EnumC4839f enumC4839f = EnumC4839f.f40340Y;
                    if (hasNext) {
                        AbstractC4841h abstractC4841h = (AbstractC4841h) it.next();
                        if (abstractC4841h.b() != enumC4839f && (!z11 || abstractC4841h.b() != EnumC4839f.f40341Z)) {
                            int ordinal = abstractC4841h.a(abstractC0993b, abstractC0993b2, abstractC0997f).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        return C4845l.d("External condition");
                                    }
                                } else {
                                    return C4845l.b("External condition failed");
                                }
                            } else {
                                z11 = true;
                            }
                        }
                    } else if (!z11) {
                        return n10;
                    } else {
                        for (AbstractC4841h abstractC4841h2 : list) {
                            if (abstractC4841h2.b() == enumC4839f) {
                                int ordinal2 = abstractC4841h2.a(abstractC0993b, abstractC0993b2, abstractC0997f).ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 == 2) {
                                            return C4845l.d("External condition");
                                        }
                                    } else {
                                        return C4845l.b("External condition failed");
                                    }
                                } else {
                                    throw new IllegalStateException("Contract violation in " + abstractC4841h2.getClass().getName() + " condition. It's not supposed to end with success");
                                }
                            }
                        }
                        C4845l c4845l = C4845l.f40353b;
                        if (c4845l != null) {
                            return c4845l;
                        }
                        C4845l.a(0);
                        throw null;
                    }
                }
            } else {
                a(23);
                throw null;
            }
        } else {
            a(22);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
        r14.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4845l n(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, boolean z10) {
        if (abstractC0993b != null) {
            if (abstractC0993b2 != null) {
                C4845l i10 = i(abstractC0993b, abstractC0993b2);
                if (i10 != null) {
                    return i10;
                }
                ArrayList d10 = d(abstractC0993b);
                ArrayList d11 = d(abstractC0993b2);
                List typeParameters = abstractC0993b.getTypeParameters();
                List typeParameters2 = abstractC0993b2.getTypeParameters();
                if (typeParameters.size() != typeParameters2.size()) {
                    for (int i11 = 0; i11 < d10.size(); i11++) {
                        if (!Cg.d.f3125a.a((A) d10.get(i11), (A) d11.get(i11))) {
                            return C4845l.d("Type parameter number mismatch");
                        }
                    }
                    return C4845l.b("Type parameter number mismatch");
                }
                X f6 = f(typeParameters, typeParameters2);
                for (int i12 = 0; i12 < typeParameters.size(); i12++) {
                    b0 b0Var = (b0) typeParameters.get(i12);
                    b0 b0Var2 = (b0) typeParameters2.get(i12);
                    if (b0Var != null) {
                        if (b0Var2 != null) {
                            List<A> upperBounds = b0Var.getUpperBounds();
                            ArrayList arrayList = new ArrayList(b0Var2.getUpperBounds());
                            if (upperBounds.size() == arrayList.size()) {
                                for (A a5 : upperBounds) {
                                    ListIterator listIterator = arrayList.listIterator();
                                    while (listIterator.hasNext()) {
                                        if (b(a5, (A) listIterator.next(), f6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return C4845l.d("Type parameter bounds mismatch");
                        }
                        a(50);
                        throw null;
                    }
                    a(49);
                    throw null;
                }
                for (int i13 = 0; i13 < d10.size(); i13++) {
                    if (!b((A) d10.get(i13), (A) d11.get(i13), f6)) {
                        return C4845l.d("Value parameter type mismatch");
                    }
                }
                if ((abstractC0993b instanceof AbstractC1013w) && (abstractC0993b2 instanceof AbstractC1013w) && ((AbstractC1013w) abstractC0993b).isSuspend() != ((AbstractC1013w) abstractC0993b2).isSuspend()) {
                    return C4845l.b("Incompatible suspendability");
                }
                if (z10) {
                    A returnType = abstractC0993b.getReturnType();
                    A returnType2 = abstractC0993b2.getReturnType();
                    if (returnType != null && returnType2 != null && ((!Bi.c.g1(returnType2) || !Bi.c.g1(returnType)) && !C0213f.j(C0213f.f2118a, f6, returnType2.B0(), returnType.B0()))) {
                        return C4845l.b("Return type mismatch");
                    }
                }
                C4845l c4845l = C4845l.f40353b;
                if (c4845l != null) {
                    return c4845l;
                }
                C4845l.a(0);
                throw null;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }
}
