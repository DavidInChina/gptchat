package a3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2.L;
import p2.M;
import s2.t;
import s2.u;
import s2.z;

/* renamed from: a3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1925c extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final u f23862f = new u();

    /* renamed from: g  reason: collision with root package name */
    public final t f23863g = new t();

    /* renamed from: h  reason: collision with root package name */
    public z f23864h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r.f
    public final M u(T2.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j6;
        boolean z11;
        long j10;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        int i13;
        long j11;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        long j12;
        boolean z17;
        long j13;
        boolean z18;
        int i15;
        int i16;
        int i17;
        long j14;
        boolean z19;
        List list;
        boolean z20;
        boolean z21;
        boolean z22;
        long j15;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        long j16;
        boolean z27;
        long j17;
        int i18 = 32;
        boolean z28 = true;
        z zVar = this.f23864h;
        if (zVar == null || aVar.f16890p0 != zVar.e()) {
            z zVar2 = new z(aVar.f48643l0);
            this.f23864h = zVar2;
            zVar2.a(aVar.f48643l0 - aVar.f16890p0);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        u uVar = this.f23862f;
        uVar.D(limit, array);
        t tVar = this.f23863g;
        tVar.n(limit, array);
        tVar.s(39);
        long i19 = (tVar.i(1) << 32) | tVar.i(32);
        tVar.s(20);
        int i20 = tVar.i(12);
        int i21 = tVar.i(8);
        uVar.G(14);
        if (i21 != 0) {
            if (i21 != 255) {
                long j18 = 1;
                long j19 = -9223372036854775807L;
                if (i21 != 4) {
                    if (i21 != 5) {
                        if (i21 != 6) {
                            obj = null;
                        } else {
                            z zVar3 = this.f23864h;
                            long a5 = j.a(i19, uVar);
                            obj = new j(a5, zVar3.b(a5));
                        }
                    } else {
                        z zVar4 = this.f23864h;
                        long v10 = uVar.v();
                        if ((uVar.u() & 128) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z18) {
                            int u10 = uVar.u();
                            if ((u10 & 128) != 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if ((u10 & 64) != 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((u10 & 32) != 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((u10 & 16) != 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            if (z24 && !z26) {
                                j16 = j.a(i19, uVar);
                            } else {
                                j16 = -9223372036854775807L;
                            }
                            if (!z24) {
                                int u11 = uVar.u();
                                ArrayList arrayList2 = new ArrayList(u11);
                                for (int i22 = 0; i22 < u11; i22++) {
                                    int u12 = uVar.u();
                                    if (!z26) {
                                        j17 = j.a(i19, uVar);
                                    } else {
                                        j17 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new C1926d(j17, u12, zVar4.b(j17)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z25) {
                                long u13 = uVar.u();
                                if ((u13 & 128) != 0) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                j19 = ((((u13 & 1) << 32) | uVar.v()) * 1000) / 90;
                            } else {
                                z27 = false;
                            }
                            int z29 = uVar.z();
                            int u14 = uVar.u();
                            z19 = z27;
                            i17 = z29;
                            list = emptyList;
                            i15 = uVar.u();
                            i16 = u14;
                            z22 = z23;
                            j14 = j19;
                            j15 = j16;
                            z20 = z26;
                            z21 = z24;
                        } else {
                            list = emptyList;
                            j15 = -9223372036854775807L;
                            j14 = -9223372036854775807L;
                            z22 = false;
                            z21 = false;
                            z20 = false;
                            z19 = false;
                            i17 = 0;
                            i16 = 0;
                            i15 = 0;
                        }
                        obj = new C1927e(v10, z18, z22, z21, z20, j15, zVar4.b(j15), list, z19, j14, i17, i16, i15);
                    }
                } else {
                    int u15 = uVar.u();
                    ArrayList arrayList3 = new ArrayList(u15);
                    int i23 = 0;
                    while (i23 < u15) {
                        long v11 = uVar.v();
                        if ((uVar.u() & 128) != 0) {
                            z10 = z28;
                        } else {
                            z10 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z10) {
                            int u16 = uVar.u();
                            if ((u16 & 128) != 0) {
                                z14 = z28;
                            } else {
                                z14 = false;
                            }
                            if ((u16 & 64) != 0) {
                                z15 = z28;
                            } else {
                                z15 = false;
                            }
                            if ((u16 & i18) != 0) {
                                z16 = z28;
                            } else {
                                z16 = false;
                            }
                            if (z15) {
                                j12 = uVar.v();
                            } else {
                                j12 = -9223372036854775807L;
                            }
                            if (!z15) {
                                int u17 = uVar.u();
                                ArrayList arrayList5 = new ArrayList(u17);
                                int i24 = 0;
                                while (i24 < u17) {
                                    arrayList5.add(new C1929g(uVar.u(), uVar.v()));
                                    i24++;
                                    i23 = i23;
                                }
                                i13 = i23;
                                arrayList4 = arrayList5;
                            } else {
                                i13 = i23;
                            }
                            if (z16) {
                                long u18 = uVar.u();
                                if ((u18 & 128) != 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                j11 = 1;
                                i14 = 32;
                                j13 = ((((u18 & 1) << 32) | uVar.v()) * 1000) / 90;
                            } else {
                                i14 = 32;
                                j11 = 1;
                                j13 = -9223372036854775807L;
                                z17 = false;
                            }
                            j6 = j13;
                            z11 = z17;
                            arrayList = arrayList4;
                            z13 = z14;
                            z12 = z15;
                            j10 = j12;
                            i12 = uVar.z();
                            i11 = uVar.u();
                            i10 = uVar.u();
                        } else {
                            i14 = i18;
                            i13 = i23;
                            j11 = j18;
                            arrayList = arrayList4;
                            j10 = -9223372036854775807L;
                            j6 = -9223372036854775807L;
                            z13 = false;
                            z12 = false;
                            z11 = false;
                            i12 = 0;
                            i11 = 0;
                            i10 = 0;
                        }
                        arrayList3.add(new h(v11, z10, z13, z12, arrayList, j10, z11, j6, i12, i11, i10));
                        i23 = i13 + 1;
                        z28 = true;
                        i18 = i14;
                        j18 = j11;
                    }
                    obj = new i(arrayList3);
                }
            } else {
                long v12 = uVar.v();
                int i25 = i20 - 4;
                byte[] bArr = new byte[i25];
                uVar.e(bArr, 0, i25);
                obj = new C1923a(v12, bArr, i19);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new M(new L[0]);
        }
        return new M(obj);
    }
}
