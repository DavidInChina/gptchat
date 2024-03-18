package ta;

import Z.AbstractC1725n;
import Z.C1741v0;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import wf.AbstractC6216a;

/* renamed from: ta.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5719s {

    /* renamed from: a  reason: collision with root package name */
    public static final float f46007a = 40;

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, boolean z11, boolean z12, wf.k kVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, AbstractC6216a abstractC6216a3, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        AbstractC4326r abstractC4326r2;
        int i14;
        int i15;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        C1741v0 v10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        AbstractC3557B.c0("onUpdateExpanded", kVar);
        AbstractC3557B.c0("onTakePhoto", abstractC6216a);
        AbstractC3557B.c0("onPickImage", abstractC6216a2);
        AbstractC3557B.c0("onSelectFile", abstractC6216a3);
        AbstractC4326r a5 = io.sentry.compose.b.a("FileUploadControl");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(703257167);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.h(z10)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(z11)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.h(z12)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar2.i(kVar)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i12 |= i19;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (rVar2.i(abstractC6216a)) {
                i18 = 16384;
            } else {
                i18 = 8192;
            }
            i12 |= i18;
        }
        if ((i11 & 32) != 0) {
            i17 = 196608;
        } else {
            if ((458752 & i10) == 0) {
                if (rVar2.i(abstractC6216a2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((i11 & 64) == 0) {
                i16 = 1572864;
            } else {
                if ((3670016 & i10) == 0) {
                    if (rVar2.i(abstractC6216a3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                }
                i13 = i11 & 128;
                if (i13 != 0) {
                    i12 |= 12582912;
                } else if ((29360128 & i10) == 0) {
                    abstractC4326r2 = abstractC4326r;
                    if (rVar2.g(abstractC4326r2)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i12 |= i14;
                    i15 = i12;
                    if ((i15 & 23967451) != 4793490 && rVar2.B()) {
                        rVar2.P();
                        abstractC4326r3 = abstractC4326r2;
                        rVar = rVar2;
                    } else {
                        if (i13 == 0) {
                            abstractC4326r3 = a5;
                        } else {
                            abstractC4326r3 = abstractC4326r2;
                        }
                        rVar = rVar2;
                        U3.f.a(Boolean.valueOf(z12), abstractC4326r3, C5705d.f45913l0, C4310b.f37696i0, "FileUploadControlAnimation", null, R4.b.X(rVar2, -628743150, new C5718q(z11, z10, kVar, abstractC6216a, abstractC6216a2, abstractC6216a3)), rVar, ((i15 >> 6) & 14) | 1600896 | ((i15 >> 18) & 112), 32);
                    }
                    v10 = rVar.v();
                    if (v10 == null) {
                        v10.f22739d = new r(z10, z11, z12, kVar, abstractC6216a, abstractC6216a2, abstractC6216a3, abstractC4326r3, i10, i11);
                        return;
                    }
                    return;
                }
                abstractC4326r2 = abstractC4326r;
                i15 = i12;
                if ((i15 & 23967451) != 4793490) {
                }
                if (i13 == 0) {
                }
                rVar = rVar2;
                U3.f.a(Boolean.valueOf(z12), abstractC4326r3, C5705d.f45913l0, C4310b.f37696i0, "FileUploadControlAnimation", null, R4.b.X(rVar2, -628743150, new C5718q(z11, z10, kVar, abstractC6216a, abstractC6216a2, abstractC6216a3)), rVar, ((i15 >> 6) & 14) | 1600896 | ((i15 >> 18) & 112), 32);
                v10 = rVar.v();
                if (v10 == null) {
                }
            }
            i12 |= i16;
            i13 = i11 & 128;
            if (i13 != 0) {
            }
            abstractC4326r2 = abstractC4326r;
            i15 = i12;
            if ((i15 & 23967451) != 4793490) {
            }
            if (i13 == 0) {
            }
            rVar = rVar2;
            U3.f.a(Boolean.valueOf(z12), abstractC4326r3, C5705d.f45913l0, C4310b.f37696i0, "FileUploadControlAnimation", null, R4.b.X(rVar2, -628743150, new C5718q(z11, z10, kVar, abstractC6216a, abstractC6216a2, abstractC6216a3)), rVar, ((i15 >> 6) & 14) | 1600896 | ((i15 >> 18) & 112), 32);
            v10 = rVar.v();
            if (v10 == null) {
            }
        }
        i12 |= i17;
        if ((i11 & 64) == 0) {
        }
        i12 |= i16;
        i13 = i11 & 128;
        if (i13 != 0) {
        }
        abstractC4326r2 = abstractC4326r;
        i15 = i12;
        if ((i15 & 23967451) != 4793490) {
        }
        if (i13 == 0) {
        }
        rVar = rVar2;
        U3.f.a(Boolean.valueOf(z12), abstractC4326r3, C5705d.f45913l0, C4310b.f37696i0, "FileUploadControlAnimation", null, R4.b.X(rVar2, -628743150, new C5718q(z11, z10, kVar, abstractC6216a, abstractC6216a2, abstractC6216a3)), rVar, ((i15 >> 6) & 14) | 1600896 | ((i15 >> 18) & 112), 32);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }
}
