package e3;

import L2.B;
import L2.G;
import L2.x;
import N.C1025i;
import android.util.Pair;
import android.util.SparseArray;
import c1.AbstractC2279d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p2.C5062o;
import p2.C5063p;
import p2.C5065s;
import p2.O;
import s2.AbstractC5530A;
import s2.u;
import x2.AbstractC6266a;

/* loaded from: classes.dex */
public final class j implements L2.q {

    /* renamed from: F  reason: collision with root package name */
    public static final byte[] f28832F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G  reason: collision with root package name */
    public static final C5065s f28833G;

    /* renamed from: A  reason: collision with root package name */
    public boolean f28834A;

    /* renamed from: E  reason: collision with root package name */
    public boolean f28838E;

    /* renamed from: b  reason: collision with root package name */
    public final List f28840b;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f28845g;

    /* renamed from: h  reason: collision with root package name */
    public final u f28846h;

    /* renamed from: m  reason: collision with root package name */
    public int f28851m;

    /* renamed from: n  reason: collision with root package name */
    public int f28852n;

    /* renamed from: o  reason: collision with root package name */
    public long f28853o;

    /* renamed from: p  reason: collision with root package name */
    public int f28854p;

    /* renamed from: q  reason: collision with root package name */
    public u f28855q;

    /* renamed from: r  reason: collision with root package name */
    public long f28856r;

    /* renamed from: s  reason: collision with root package name */
    public int f28857s;

    /* renamed from: w  reason: collision with root package name */
    public i f28861w;

    /* renamed from: x  reason: collision with root package name */
    public int f28862x;

    /* renamed from: y  reason: collision with root package name */
    public int f28863y;

    /* renamed from: z  reason: collision with root package name */
    public int f28864z;

    /* renamed from: a  reason: collision with root package name */
    public final int f28839a = 0;

    /* renamed from: i  reason: collision with root package name */
    public final U3.e f28847i = new U3.e(5);

    /* renamed from: j  reason: collision with root package name */
    public final u f28848j = new u(16);

    /* renamed from: d  reason: collision with root package name */
    public final u f28842d = new u(t2.g.f45670a);

    /* renamed from: e  reason: collision with root package name */
    public final u f28843e = new u(5);

    /* renamed from: f  reason: collision with root package name */
    public final u f28844f = new u();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque f28849k = new ArrayDeque();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque f28850l = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f28841c = new SparseArray();

    /* renamed from: u  reason: collision with root package name */
    public long f28859u = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public long f28858t = -9223372036854775807L;

    /* renamed from: v  reason: collision with root package name */
    public long f28860v = -9223372036854775807L;

    /* renamed from: B  reason: collision with root package name */
    public L2.s f28835B = L2.s.f10638m;

    /* renamed from: C  reason: collision with root package name */
    public G[] f28836C = new G[0];

    /* renamed from: D  reason: collision with root package name */
    public G[] f28837D = new G[0];

    static {
        p2.r rVar = new p2.r();
        rVar.f42237k = "application/x-emsg";
        f28833G = rVar.a();
    }

    public j() {
        List emptyList = Collections.emptyList();
        this.f28840b = Collections.unmodifiableList(emptyList);
        byte[] bArr = new byte[16];
        this.f28845g = bArr;
        this.f28846h = new u(bArr);
    }

    public static C5063p c(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            C2792b c2792b = (C2792b) arrayList.get(i10);
            if (c2792b.f48626Z == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c2792b.f28801h0.f45193a;
                C1025i t10 = AbstractC2279d.t(bArr);
                if (t10 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) t10.f12351h0;
                }
                if (uuid == null) {
                    s2.p.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C5062o(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C5063p(null, false, (C5062o[]) arrayList2.toArray(new C5062o[0]));
    }

    public static void e(u uVar, int i10, r rVar) {
        boolean z10;
        uVar.F(i10 + 8);
        int g10 = uVar.g();
        if ((g10 & 1) == 0) {
            if ((g10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int x10 = uVar.x();
            if (x10 == 0) {
                Arrays.fill(rVar.f28930l, 0, rVar.f28923e, false);
                return;
            } else if (x10 == rVar.f28923e) {
                Arrays.fill(rVar.f28930l, 0, x10, z10);
                int a5 = uVar.a();
                u uVar2 = rVar.f28932n;
                uVar2.C(a5);
                rVar.f28929k = true;
                rVar.f28933o = true;
                uVar.e(uVar2.f45193a, 0, uVar2.f45195c);
                uVar2.F(0);
                rVar.f28933o = false;
                return;
            } else {
                StringBuilder q10 = android.gov.nist.core.a.q("Senc sample count ", x10, " is different from fragment sample count");
                q10.append(rVar.f28923e);
                throw O.a(q10.toString(), null);
            }
        }
        throw O.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0203, code lost:
        throw p2.O.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0204, code lost:
        r18 = r7;
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
        if (r29.f28834A == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
        r7 = r29.f28844f;
        r7.C(r4);
        r21 = r3;
        r0.readFully(r7.f45193a, 0, r29.f28864z);
        r11.a(r29.f28864z, r7);
        r3 = r29.f28864z;
        r4 = t2.g.e(r7.f45195c, r7.f45193a);
        r7.F("video/hevc".equals(r5.f42319q0) ? 1 : 0);
        r7.E(r4);
        q1.AbstractC5260f.k(r8, r7, r29.f28837D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023d, code lost:
        r21 = r3;
        r3 = r11.c(r0, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0245, code lost:
        r29.f28863y += r3;
        r29.f28864z -= r3;
        r7 = r18;
        r13 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0257, code lost:
        r3 = r29.f28863y;
        r4 = r29.f28862x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x025b, code lost:
        if (r3 >= r4) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x025d, code lost:
        r29.f28863y += r11.c(r0, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026b, code lost:
        if (r2.f28831l != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026d, code lost:
        r6 = r2.f28823d.f28942g[r2.f28825f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027c, code lost:
        if (r6.f28928j[r2.f28825f] == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027e, code lost:
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0280, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0285, code lost:
        if (r2.a() == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0287, code lost:
        r23 = 1073741824 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028d, code lost:
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028f, code lost:
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0293, code lost:
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0295, code lost:
        r26 = r0.f28916c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029a, code lost:
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029c, code lost:
        r11.e(r8, r23, r29.f28862x, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ad, code lost:
        if (r12.isEmpty() != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02af, code lost:
        r0 = (e3.h) r12.removeFirst();
        r29.f28857s -= r0.f28819c;
        r3 = r0.f28818b;
        r4 = r0.f28817a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c0, code lost:
        if (r3 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c2, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c3, code lost:
        r3 = r29.f28836C;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c7, code lost:
        if (r7 >= r6) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c9, code lost:
        r3[r7].e(r4, 1, r0.f28819c, r29.f28857s, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e3, code lost:
        if (r2.b() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e5, code lost:
        r29.f28861w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e8, code lost:
        r29.f28851m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ec, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
        r3 = r29.f28851m;
        r6 = r2.f28821b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
        if (r3 != 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        if (r2.f28831l != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
        r3 = r2.f28823d.f28939d[r2.f28825f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
        r3 = r6.f28926h[r2.f28825f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r29.f28862x = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
        if (r2.f28825f >= r2.f28828i) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        r0.l(r3);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        r3 = r6.f28932n;
        r0 = r0.f28917d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
        if (r0 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
        r0 = r2.f28825f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
        if (r6.f28929k == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
        if (r6.f28930l[r0] == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
        r3.G(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if (r2.b() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
        r29.f28861w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0102, code lost:
        r29.f28851m = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (r2.f28823d.f28936a.f28909g != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
        r29.f28862x = r3 - 8;
        r0.l(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
        if ("audio/ac4".equals(r2.f28823d.f28936a.f28908f.f42319q0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
        r29.f28863y = r2.c(r29.f28862x, 7);
        r3 = r29.f28862x;
        r8 = r29.f28846h;
        L2.AbstractC0881b.b(r3, r8);
        r2.f28820a.a(7, r8);
        r29.f28863y += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
        r29.f28863y = r2.c(r29.f28862x, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
        r29.f28862x += r29.f28863y;
        r29.f28851m = 4;
        r29.f28864z = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
        r3 = r2.f28823d;
        r7 = r3.f28936a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
        if (r2.f28831l != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        r8 = r3.f28941f[r2.f28825f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        r8 = r6.f28927i[r2.f28825f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
        r3 = r7.f28912j;
        r11 = r2.f28820a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        if (r3 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
        r13 = r29.f28843e;
        r14 = r13.f45193a;
        r14[0] = 0;
        r14[1] = 0;
        r14[2] = 0;
        r15 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
        if (r29.f28863y >= r29.f28862x) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
        r4 = r29.f28864z;
        r5 = r7.f28908f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
        if (r4 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0194, code lost:
        r0.readFully(r14, r3, r15);
        r13.F(0);
        r4 = r13.g();
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
        if (r4 < 1) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
        r29.f28864z = r4 - 1;
        r4 = r29.f28842d;
        r4.F(0);
        r11.a(4, r4);
        r11.a(1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
        if (r29.f28837D.length <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
        r4 = r5.f42319q0;
        r5 = r14[4];
        r7 = t2.g.f45670a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
        if ("video/avc".equals(r4) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c9, code lost:
        r20 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ce, code lost:
        if ((r5 & 31) == 6) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
        r20 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
        if ("video/hevc".equals(r4) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (((r5 & 126) >> 1) != 39) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e2, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
        r20 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e7, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e8, code lost:
        r29.f28834A = r4;
        r29.f28863y += 5;
        r29.f28862x += r3;
        r7 = r18;
        r13 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // L2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(L2.r rVar, I2.i iVar) {
        long j6;
        long j10;
        String str;
        long j11;
        long j12;
        long j13;
        String str2;
        long j14;
        G[] gArr;
        long j15;
        long y10;
        long y11;
        int[] iArr;
        L2.r rVar2 = rVar;
        while (true) {
            int i10 = this.f28851m;
            ArrayDeque arrayDeque = this.f28849k;
            SparseArray sparseArray = this.f28841c;
            if (i10 != 0) {
                ArrayDeque arrayDeque2 = this.f28850l;
                if (i10 != 1) {
                    long j16 = Long.MAX_VALUE;
                    if (i10 != 2) {
                        i iVar2 = this.f28861w;
                        if (iVar2 != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j17 = Long.MAX_VALUE;
                        i iVar3 = null;
                        for (int i11 = 0; i11 < size; i11++) {
                            i iVar4 = (i) sparseArray.valueAt(i11);
                            boolean z10 = iVar4.f28831l;
                            if (z10 || iVar4.f28825f != iVar4.f28823d.f28937b) {
                                r rVar3 = iVar4.f28821b;
                                if (!z10 || iVar4.f28827h != rVar3.f28922d) {
                                    if (!z10) {
                                        j10 = iVar4.f28823d.f28938c[iVar4.f28825f];
                                    } else {
                                        j10 = rVar3.f28924f[iVar4.f28827h];
                                    }
                                    if (j10 < j17) {
                                        iVar3 = iVar4;
                                        j17 = j10;
                                    }
                                }
                            }
                        }
                        if (iVar3 == null) {
                            int o10 = (int) (this.f28856r - rVar.o());
                            if (o10 >= 0) {
                                rVar2.l(o10);
                                this.f28851m = 0;
                                this.f28854p = 0;
                            } else {
                                throw O.a("Offset to end of mdat was negative.", null);
                            }
                        } else {
                            if (!iVar3.f28831l) {
                                j6 = iVar3.f28823d.f28938c[iVar3.f28825f];
                            } else {
                                j6 = iVar3.f28821b.f28924f[iVar3.f28827h];
                            }
                            int o11 = (int) (j6 - rVar.o());
                            if (o11 < 0) {
                                s2.p.g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                o11 = 0;
                            }
                            rVar2.l(o11);
                            this.f28861w = iVar3;
                            iVar2 = iVar3;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        i iVar5 = null;
                        for (int i12 = 0; i12 < size2; i12++) {
                            r rVar4 = ((i) sparseArray.valueAt(i12)).f28821b;
                            if (rVar4.f28933o) {
                                long j18 = rVar4.f28921c;
                                if (j18 < j16) {
                                    iVar5 = (i) sparseArray.valueAt(i12);
                                    j16 = j18;
                                }
                            }
                        }
                        if (iVar5 == null) {
                            this.f28851m = 3;
                        } else {
                            int o12 = (int) (j16 - rVar.o());
                            if (o12 >= 0) {
                                rVar2.l(o12);
                                r rVar5 = iVar5.f28821b;
                                u uVar = rVar5.f28932n;
                                rVar2.readFully(uVar.f45193a, 0, uVar.f45195c);
                                uVar.F(0);
                                rVar5.f28933o = false;
                            } else {
                                throw O.a("Offset to encryption data was negative.", null);
                            }
                        }
                    }
                } else {
                    int i13 = ((int) this.f28853o) - this.f28854p;
                    u uVar2 = this.f28855q;
                    if (uVar2 != null) {
                        rVar2.readFully(uVar2.f45193a, 8, i13);
                        C2792b c2792b = new C2792b(this.f28852n, uVar2);
                        long o13 = rVar.o();
                        if (!arrayDeque.isEmpty()) {
                            ((C2791a) arrayDeque.peek()).f28799i0.add(c2792b);
                        } else {
                            int i14 = c2792b.f48626Z;
                            if (i14 == 1936286840) {
                                uVar2.F(8);
                                int h10 = AbstractC6266a.h(uVar2.g());
                                uVar2.G(4);
                                long v10 = uVar2.v();
                                if (h10 == 0) {
                                    y10 = uVar2.v();
                                    y11 = uVar2.v();
                                } else {
                                    y10 = uVar2.y();
                                    y11 = uVar2.y();
                                }
                                long j19 = y11 + o13;
                                int i15 = AbstractC5530A.f45131a;
                                long I10 = AbstractC5530A.I(y10, 1000000L, v10, RoundingMode.FLOOR);
                                uVar2.G(2);
                                int z11 = uVar2.z();
                                int[] iArr2 = new int[z11];
                                long[] jArr = new long[z11];
                                long[] jArr2 = new long[z11];
                                long[] jArr3 = new long[z11];
                                long j20 = j19;
                                long j21 = I10;
                                int i16 = 0;
                                while (i16 < z11) {
                                    int g10 = uVar2.g();
                                    if ((g10 & Integer.MIN_VALUE) == 0) {
                                        long v11 = uVar2.v();
                                        iArr2[i16] = g10 & Integer.MAX_VALUE;
                                        jArr[i16] = j20;
                                        jArr3[i16] = j21;
                                        long j22 = y10 + v11;
                                        long[] jArr4 = jArr2;
                                        long[] jArr5 = jArr3;
                                        j21 = AbstractC5530A.I(j22, 1000000L, v10, RoundingMode.FLOOR);
                                        jArr4[i16] = j21 - jArr5[i16];
                                        uVar2.G(4);
                                        j20 += iArr[i16];
                                        i16++;
                                        jArr3 = jArr5;
                                        iArr2 = iArr2;
                                        z11 = z11;
                                        jArr = jArr;
                                        jArr2 = jArr4;
                                        y10 = j22;
                                    } else {
                                        throw O.a("Unhandled indirect reference", null);
                                    }
                                }
                                Pair create = Pair.create(Long.valueOf(I10), new L2.k(iArr2, jArr, jArr2, jArr3));
                                this.f28860v = ((Long) create.first).longValue();
                                this.f28835B.b((B) create.second);
                                this.f28838E = true;
                            } else if (i14 == 1701671783 && this.f28836C.length != 0) {
                                uVar2.F(8);
                                int h11 = AbstractC6266a.h(uVar2.g());
                                if (h11 != 0) {
                                    if (h11 != 1) {
                                        android.gov.nist.core.a.v("Skipping unsupported emsg version: ", h11, "FragmentedMp4Extractor");
                                    } else {
                                        long v12 = uVar2.v();
                                        long y12 = uVar2.y();
                                        RoundingMode roundingMode = RoundingMode.FLOOR;
                                        j13 = AbstractC5530A.I(y12, 1000000L, v12, roundingMode);
                                        j14 = AbstractC5530A.I(uVar2.v(), 1000L, v12, roundingMode);
                                        long v13 = uVar2.v();
                                        str2 = uVar2.p();
                                        str2.getClass();
                                        String p10 = uVar2.p();
                                        p10.getClass();
                                        str = p10;
                                        j11 = v13;
                                        j12 = -9223372036854775807L;
                                    }
                                } else {
                                    str2 = uVar2.p();
                                    str2.getClass();
                                    String p11 = uVar2.p();
                                    p11.getClass();
                                    long v14 = uVar2.v();
                                    long v15 = uVar2.v();
                                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                                    long I11 = AbstractC5530A.I(v15, 1000000L, v14, roundingMode2);
                                    long j23 = this.f28860v;
                                    if (j23 != -9223372036854775807L) {
                                        j15 = j23 + I11;
                                    } else {
                                        j15 = -9223372036854775807L;
                                    }
                                    j14 = AbstractC5530A.I(uVar2.v(), 1000L, v14, roundingMode2);
                                    j12 = I11;
                                    j13 = j15;
                                    str = p11;
                                    j11 = uVar2.v();
                                }
                                byte[] bArr = new byte[uVar2.a()];
                                uVar2.e(bArr, 0, uVar2.a());
                                U3.e eVar = this.f28847i;
                                ((ByteArrayOutputStream) eVar.f17400Y).reset();
                                try {
                                    DataOutputStream dataOutputStream = (DataOutputStream) eVar.f17401Z;
                                    dataOutputStream.writeBytes(str2);
                                    dataOutputStream.writeByte(0);
                                    DataOutputStream dataOutputStream2 = (DataOutputStream) eVar.f17401Z;
                                    dataOutputStream2.writeBytes(str);
                                    dataOutputStream2.writeByte(0);
                                    ((DataOutputStream) eVar.f17401Z).writeLong(j14);
                                    ((DataOutputStream) eVar.f17401Z).writeLong(j11);
                                    ((DataOutputStream) eVar.f17401Z).write(bArr);
                                    ((DataOutputStream) eVar.f17401Z).flush();
                                    u uVar3 = new u(((ByteArrayOutputStream) eVar.f17400Y).toByteArray());
                                    int a5 = uVar3.a();
                                    for (G g11 : this.f28836C) {
                                        uVar3.F(0);
                                        g11.a(a5, uVar3);
                                    }
                                    if (j13 == -9223372036854775807L) {
                                        arrayDeque2.addLast(new h(a5, j12, true));
                                        this.f28857s += a5;
                                    } else if (!arrayDeque2.isEmpty()) {
                                        arrayDeque2.addLast(new h(a5, j13, false));
                                        this.f28857s += a5;
                                    } else {
                                        for (G g12 : this.f28836C) {
                                            g12.e(j13, 1, a5, 0, null);
                                        }
                                    }
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            }
                        }
                        rVar2 = rVar;
                    } else {
                        rVar2.l(i13);
                    }
                    f(rVar.o());
                }
            } else {
                int i17 = this.f28854p;
                u uVar4 = this.f28848j;
                if (i17 == 0) {
                    if (!rVar2.b(uVar4.f45193a, 0, 8, true)) {
                        return -1;
                    }
                    this.f28854p = 8;
                    uVar4.F(0);
                    this.f28853o = uVar4.v();
                    this.f28852n = uVar4.g();
                }
                long j24 = this.f28853o;
                if (j24 == 1) {
                    rVar2.readFully(uVar4.f45193a, 8, 8);
                    this.f28854p += 8;
                    this.f28853o = uVar4.y();
                } else if (j24 == 0) {
                    long h12 = rVar.h();
                    if (h12 == -1 && !arrayDeque.isEmpty()) {
                        h12 = ((C2791a) arrayDeque.peek()).f28798h0;
                    }
                    if (h12 != -1) {
                        this.f28853o = (h12 - rVar.o()) + this.f28854p;
                    }
                }
                if (this.f28853o >= this.f28854p) {
                    long o14 = rVar.o() - this.f28854p;
                    int i18 = this.f28852n;
                    if ((i18 == 1836019558 || i18 == 1835295092) && !this.f28838E) {
                        this.f28835B.b(new L2.u(this.f28859u, o14));
                        this.f28838E = true;
                    }
                    if (this.f28852n == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            r rVar6 = ((i) sparseArray.valueAt(i19)).f28821b;
                            rVar6.getClass();
                            rVar6.f28921c = o14;
                            rVar6.f28920b = o14;
                        }
                    }
                    int i20 = this.f28852n;
                    if (i20 == 1835295092) {
                        this.f28861w = null;
                        this.f28856r = o14 + this.f28853o;
                        this.f28851m = 2;
                    } else if (i20 != 1836019574 && i20 != 1953653099 && i20 != 1835297121 && i20 != 1835626086 && i20 != 1937007212 && i20 != 1836019558 && i20 != 1953653094 && i20 != 1836475768 && i20 != 1701082227) {
                        if (i20 != 1751411826 && i20 != 1835296868 && i20 != 1836476516 && i20 != 1936286840 && i20 != 1937011556 && i20 != 1937011827 && i20 != 1668576371 && i20 != 1937011555 && i20 != 1937011578 && i20 != 1937013298 && i20 != 1937007471 && i20 != 1668232756 && i20 != 1937011571 && i20 != 1952867444 && i20 != 1952868452 && i20 != 1953196132 && i20 != 1953654136 && i20 != 1953658222 && i20 != 1886614376 && i20 != 1935763834 && i20 != 1935763823 && i20 != 1936027235 && i20 != 1970628964 && i20 != 1935828848 && i20 != 1936158820 && i20 != 1701606260 && i20 != 1835362404 && i20 != 1701671783) {
                            if (this.f28853o <= 2147483647L) {
                                this.f28855q = null;
                                this.f28851m = 1;
                            } else {
                                throw O.b("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        } else if (this.f28854p == 8) {
                            if (this.f28853o <= 2147483647L) {
                                u uVar5 = new u((int) this.f28853o);
                                System.arraycopy(uVar4.f45193a, 0, uVar5.f45193a, 0, 8);
                                this.f28855q = uVar5;
                                this.f28851m = 1;
                            } else {
                                throw O.b("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw O.b("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else {
                        long o15 = (rVar.o() + this.f28853o) - 8;
                        arrayDeque.push(new C2791a(this.f28852n, o15));
                        if (this.f28853o == this.f28854p) {
                            f(o15);
                        } else {
                            this.f28851m = 0;
                            this.f28854p = 0;
                        }
                    }
                } else {
                    throw O.b("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // L2.q
    public final void d(L2.s sVar) {
        int i10;
        this.f28835B = sVar;
        int i11 = 0;
        this.f28851m = 0;
        this.f28854p = 0;
        G[] gArr = new G[2];
        this.f28836C = gArr;
        int i12 = 100;
        if ((this.f28839a & 4) != 0) {
            gArr[0] = sVar.f(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        G[] gArr2 = (G[]) AbstractC5530A.E(i10, this.f28836C);
        this.f28836C = gArr2;
        for (G g10 : gArr2) {
            g10.b(f28833G);
        }
        List list = this.f28840b;
        this.f28837D = new G[list.size()];
        while (i11 < this.f28837D.length) {
            G f6 = this.f28835B.f(i12, 3);
            f6.b((C5065s) list.get(i11));
            this.f28837D[i11] = f6;
            i11++;
            i12++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x0785, code lost:
        r5 = r0;
        r5.f28851m = 0;
        r5.f28854p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x078b, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x067f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j6) {
        j jVar;
        q qVar;
        String str;
        int i10;
        int i11;
        ArrayList arrayList;
        SparseArray sparseArray;
        ArrayList arrayList2;
        int i12;
        j jVar2;
        int i13;
        q qVar2;
        String str2;
        int size;
        int i14;
        boolean z10;
        long j10;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        int i16;
        ArrayList arrayList3;
        int i17;
        int i18;
        C2791a c2791a;
        ArrayList arrayList4;
        SparseArray sparseArray2;
        int i19;
        i iVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        i iVar2;
        boolean z19;
        boolean z20;
        boolean z21;
        int i20;
        boolean z22;
        int i21;
        int i22;
        boolean z23;
        int i23;
        int i24;
        int i25;
        u uVar;
        boolean z24;
        int i26;
        long j11;
        p pVar;
        i iVar3;
        boolean z25;
        long[] jArr;
        char c10;
        long j12;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z26;
        boolean z27;
        f fVar;
        f fVar2;
        ArrayList arrayList5;
        long y10;
        final j jVar3 = this;
        while (true) {
            ArrayDeque arrayDeque = jVar3.f28849k;
            if (arrayDeque.isEmpty() || ((C2791a) arrayDeque.peek()).f28798h0 != j6) {
                break;
            }
            C2791a c2791a2 = (C2791a) arrayDeque.pop();
            int i31 = c2791a2.f48626Z;
            SparseArray sparseArray3 = jVar3.f28841c;
            ArrayList arrayList6 = c2791a2.f28799i0;
            int i32 = 1;
            int i33 = jVar3.f28839a;
            int i34 = 12;
            if (i31 == 1836019574) {
                C5063p c11 = c(arrayList6);
                C2791a i35 = c2791a2.i(1836475768);
                i35.getClass();
                SparseArray sparseArray4 = new SparseArray();
                ArrayList arrayList7 = i35.f28799i0;
                int size2 = arrayList7.size();
                int i36 = 0;
                long j13 = -9223372036854775807L;
                while (i36 < size2) {
                    C2792b c2792b = (C2792b) arrayList7.get(i36);
                    int i37 = c2792b.f48626Z;
                    u uVar2 = c2792b.f28801h0;
                    if (i37 == 1953654136) {
                        uVar2.F(i34);
                        arrayList5 = arrayList7;
                        Pair create = Pair.create(Integer.valueOf(uVar2.g()), new f(uVar2.g() - i32, uVar2.g(), uVar2.g(), uVar2.g()));
                        sparseArray4.put(((Integer) create.first).intValue(), (f) create.second);
                    } else {
                        arrayList5 = arrayList7;
                        if (i37 == 1835362404) {
                            uVar2.F(8);
                            if (AbstractC6266a.h(uVar2.g()) == 0) {
                                y10 = uVar2.v();
                            } else {
                                y10 = uVar2.y();
                            }
                            j13 = y10;
                        }
                    }
                    i36++;
                    arrayList7 = arrayList5;
                    i34 = 12;
                    i32 = 1;
                }
                x xVar = new x();
                if ((i33 & 16) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                ArrayList g10 = e.g(c2791a2, xVar, j13, c11, z26, false, new w8.f() { // from class: e3.g
                    @Override // w8.f
                    public final Object apply(Object obj) {
                        p pVar2 = (p) obj;
                        j.this.getClass();
                        return pVar2;
                    }
                });
                int size3 = g10.size();
                if (sparseArray3.size() == 0) {
                    for (int i38 = 0; i38 < size3; i38++) {
                        s sVar = (s) g10.get(i38);
                        p pVar2 = sVar.f28936a;
                        G f6 = jVar3.f28835B.f(i38, pVar2.f28904b);
                        int size4 = sparseArray4.size();
                        int i39 = pVar2.f28903a;
                        if (size4 == 1) {
                            fVar2 = (f) sparseArray4.valueAt(0);
                        } else {
                            fVar2 = (f) sparseArray4.get(i39);
                            fVar2.getClass();
                        }
                        sparseArray3.put(i39, new i(f6, sVar, fVar2));
                        jVar3.f28859u = Math.max(jVar3.f28859u, pVar2.f28907e);
                    }
                    jVar3.f28835B.d();
                } else {
                    if (sparseArray3.size() == size3) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    Gi.e.n(z27);
                    for (int i40 = 0; i40 < size3; i40++) {
                        s sVar2 = (s) g10.get(i40);
                        p pVar3 = sVar2.f28936a;
                        i iVar4 = (i) sparseArray3.get(pVar3.f28903a);
                        if (sparseArray4.size() == 1) {
                            fVar = (f) sparseArray4.valueAt(0);
                        } else {
                            fVar = (f) sparseArray4.get(pVar3.f28903a);
                            fVar.getClass();
                        }
                        iVar4.f28823d = sVar2;
                        iVar4.f28824e = fVar;
                        iVar4.f28820a.b(sVar2.f28936a.f28908f);
                        iVar4.d();
                    }
                }
                jVar = jVar3;
            } else if (i31 == 1836019558) {
                ArrayList arrayList8 = c2791a2.f28800j0;
                int size5 = arrayList8.size();
                int i41 = 0;
                while (i41 < size5) {
                    C2791a c2791a3 = (C2791a) arrayList8.get(i41);
                    if (c2791a3.f48626Z == 1953653094) {
                        C2792b j14 = c2791a3.j(1952868452);
                        j14.getClass();
                        u uVar3 = j14.f28801h0;
                        uVar3.F(8);
                        int g11 = uVar3.g();
                        i iVar5 = (i) sparseArray3.get(uVar3.g());
                        if (iVar5 == null) {
                            iVar5 = null;
                        } else {
                            int i42 = g11 & 1;
                            r rVar = iVar5.f28821b;
                            if (i42 != 0) {
                                long y11 = uVar3.y();
                                rVar.f28920b = y11;
                                rVar.f28921c = y11;
                            }
                            f fVar3 = iVar5.f28824e;
                            if ((g11 & 2) != 0) {
                                i27 = uVar3.g() - 1;
                            } else {
                                i27 = fVar3.f28812a;
                            }
                            if ((g11 & 8) != 0) {
                                i28 = uVar3.g();
                            } else {
                                i28 = fVar3.f28813b;
                            }
                            if ((g11 & 16) != 0) {
                                i29 = uVar3.g();
                            } else {
                                i29 = fVar3.f28814c;
                            }
                            if ((g11 & 32) != 0) {
                                i30 = uVar3.g();
                            } else {
                                i30 = fVar3.f28815d;
                            }
                            rVar.f28919a = new f(i27, i28, i29, i30);
                        }
                        if (iVar5 != null) {
                            r rVar2 = iVar5.f28821b;
                            long j15 = rVar2.f28934p;
                            boolean z28 = rVar2.f28935q;
                            iVar5.d();
                            iVar5.f28831l = true;
                            C2792b j16 = c2791a3.j(1952867444);
                            if (j16 != null && (i33 & 2) == 0) {
                                u uVar4 = j16.f28801h0;
                                uVar4.F(8);
                                if (AbstractC6266a.h(uVar4.g()) == 1) {
                                    j12 = uVar4.y();
                                } else {
                                    j12 = uVar4.v();
                                }
                                rVar2.f28934p = j12;
                                rVar2.f28935q = true;
                            } else {
                                rVar2.f28934p = j15;
                                rVar2.f28935q = z28;
                            }
                            ArrayList arrayList9 = c2791a3.f28799i0;
                            int size6 = arrayList9.size();
                            int i43 = 0;
                            int i44 = 0;
                            int i45 = 0;
                            while (true) {
                                i13 = 1953658222;
                                if (i43 >= size6) {
                                    break;
                                }
                                ArrayList arrayList10 = arrayList8;
                                C2792b c2792b2 = (C2792b) arrayList9.get(i43);
                                int i46 = size5;
                                if (c2792b2.f48626Z == 1953658222) {
                                    u uVar5 = c2792b2.f28801h0;
                                    uVar5.F(12);
                                    int x10 = uVar5.x();
                                    if (x10 > 0) {
                                        i45 += x10;
                                        i44++;
                                    }
                                }
                                i43++;
                                size5 = i46;
                                arrayList8 = arrayList10;
                            }
                            arrayList2 = arrayList8;
                            i12 = size5;
                            iVar5.f28827h = 0;
                            iVar5.f28826g = 0;
                            iVar5.f28825f = 0;
                            rVar2.f28922d = i44;
                            rVar2.f28923e = i45;
                            if (rVar2.f28925g.length < i44) {
                                rVar2.f28924f = new long[i44];
                                rVar2.f28925g = new int[i44];
                            }
                            if (rVar2.f28926h.length < i45) {
                                int i47 = (i45 * 125) / 100;
                                rVar2.f28926h = new int[i47];
                                rVar2.f28927i = new long[i47];
                                rVar2.f28928j = new boolean[i47];
                                rVar2.f28930l = new boolean[i47];
                            }
                            int i48 = 0;
                            int i49 = 0;
                            int i50 = 0;
                            while (true) {
                                long j17 = 0;
                                if (i48 < size6) {
                                    C2792b c2792b3 = (C2792b) arrayList9.get(i48);
                                    if (c2792b3.f48626Z == i13) {
                                        int i51 = i49 + 1;
                                        u uVar6 = c2792b3.f28801h0;
                                        uVar6.F(8);
                                        int g12 = uVar6.g();
                                        i19 = size6;
                                        p pVar4 = iVar5.f28823d.f28936a;
                                        f fVar4 = rVar2.f28919a;
                                        int i52 = AbstractC5530A.f45131a;
                                        sparseArray2 = sparseArray3;
                                        rVar2.f28925g[i49] = uVar6.x();
                                        long[] jArr2 = rVar2.f28924f;
                                        arrayList4 = arrayList6;
                                        c2791a = c2791a3;
                                        long j18 = rVar2.f28920b;
                                        jArr2[i49] = j18;
                                        if ((g12 & 1) != 0) {
                                            i18 = i41;
                                            i17 = i48;
                                            jArr2[i49] = j18 + uVar6.g();
                                        } else {
                                            i17 = i48;
                                            i18 = i41;
                                        }
                                        if ((g12 & 4) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        int i53 = fVar4.f28815d;
                                        if (z14) {
                                            i53 = uVar6.g();
                                        }
                                        if ((g12 & 256) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if ((g12 & 512) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if ((g12 & 1024) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if ((g12 & 2048) != 0) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        long[] jArr3 = pVar4.f28910h;
                                        int i54 = i53;
                                        if (jArr3 != null) {
                                            arrayList3 = arrayList9;
                                            if (jArr3.length != 1 || (jArr = pVar4.f28911i) == null) {
                                                z19 = z17;
                                            } else {
                                                long j19 = jArr3[0];
                                                if (j19 == 0) {
                                                    z19 = z17;
                                                    c10 = 0;
                                                    z20 = z18;
                                                    iVar2 = iVar5;
                                                } else {
                                                    z20 = z18;
                                                    z19 = z17;
                                                    iVar2 = iVar5;
                                                    if (AbstractC5530A.I(j19 + jArr[0], 1000000L, pVar4.f28906d, RoundingMode.FLOOR) >= pVar4.f28907e) {
                                                        c10 = 0;
                                                    }
                                                    int[] iArr = rVar2.f28926h;
                                                    long[] jArr4 = rVar2.f28927i;
                                                    boolean[] zArr = rVar2.f28928j;
                                                    if (pVar4.f28904b != 2 && (i33 & 1) != 0) {
                                                        z21 = true;
                                                    } else {
                                                        z21 = false;
                                                    }
                                                    i20 = rVar2.f28925g[i49] + i50;
                                                    int i55 = i33;
                                                    long j20 = rVar2.f28934p;
                                                    while (i50 < i20) {
                                                        if (z15) {
                                                            z22 = z15;
                                                            i21 = i20;
                                                            i22 = uVar6.g();
                                                        } else {
                                                            i21 = i20;
                                                            i22 = fVar4.f28813b;
                                                            z22 = z15;
                                                        }
                                                        if (i22 >= 0) {
                                                            if (z16) {
                                                                z23 = z16;
                                                                i23 = uVar6.g();
                                                            } else {
                                                                z23 = z16;
                                                                i23 = fVar4.f28814c;
                                                            }
                                                            if (i23 >= 0) {
                                                                if (z19) {
                                                                    i24 = uVar6.g();
                                                                } else if (i50 == 0 && z14) {
                                                                    i24 = i54;
                                                                } else {
                                                                    i24 = fVar4.f28815d;
                                                                }
                                                                if (z20) {
                                                                    i25 = i55;
                                                                    uVar = uVar6;
                                                                    z24 = z14;
                                                                    i26 = uVar6.g();
                                                                } else {
                                                                    z24 = z14;
                                                                    i25 = i55;
                                                                    uVar = uVar6;
                                                                    i26 = 0;
                                                                }
                                                                long I10 = AbstractC5530A.I((i26 + j20) - j17, 1000000L, pVar4.f28905c, RoundingMode.FLOOR);
                                                                jArr4[i50] = I10;
                                                                if (!rVar2.f28935q) {
                                                                    iVar3 = iVar2;
                                                                    pVar = pVar4;
                                                                    j11 = j20;
                                                                    jArr4[i50] = I10 + iVar3.f28823d.f28943h;
                                                                } else {
                                                                    j11 = j20;
                                                                    iVar3 = iVar2;
                                                                    pVar = pVar4;
                                                                }
                                                                iArr[i50] = i23;
                                                                if (((i24 >> 16) & 1) == 0 && (!z21 || i50 == 0)) {
                                                                    z25 = true;
                                                                } else {
                                                                    z25 = false;
                                                                }
                                                                zArr[i50] = z25;
                                                                j20 = j11 + i22;
                                                                i50++;
                                                                pVar4 = pVar;
                                                                i20 = i21;
                                                                z15 = z22;
                                                                z16 = z23;
                                                                uVar6 = uVar;
                                                                i55 = i25;
                                                                iVar2 = iVar3;
                                                                z14 = z24;
                                                            } else {
                                                                throw O.a("Unexpected negative value: " + i23, null);
                                                            }
                                                        } else {
                                                            throw O.a("Unexpected negative value: " + i22, null);
                                                        }
                                                    }
                                                    int i56 = i20;
                                                    i16 = i55;
                                                    iVar = iVar2;
                                                    rVar2.f28934p = j20;
                                                    i49 = i51;
                                                    i50 = i56;
                                                }
                                                j17 = jArr[c10];
                                                int[] iArr2 = rVar2.f28926h;
                                                long[] jArr42 = rVar2.f28927i;
                                                boolean[] zArr2 = rVar2.f28928j;
                                                if (pVar4.f28904b != 2) {
                                                }
                                                z21 = false;
                                                i20 = rVar2.f28925g[i49] + i50;
                                                int i552 = i33;
                                                long j202 = rVar2.f28934p;
                                                while (i50 < i20) {
                                                }
                                                int i562 = i20;
                                                i16 = i552;
                                                iVar = iVar2;
                                                rVar2.f28934p = j202;
                                                i49 = i51;
                                                i50 = i562;
                                            }
                                        } else {
                                            z19 = z17;
                                            arrayList3 = arrayList9;
                                        }
                                        z20 = z18;
                                        iVar2 = iVar5;
                                        int[] iArr22 = rVar2.f28926h;
                                        long[] jArr422 = rVar2.f28927i;
                                        boolean[] zArr22 = rVar2.f28928j;
                                        if (pVar4.f28904b != 2) {
                                        }
                                        z21 = false;
                                        i20 = rVar2.f28925g[i49] + i50;
                                        int i5522 = i33;
                                        long j2022 = rVar2.f28934p;
                                        while (i50 < i20) {
                                        }
                                        int i5622 = i20;
                                        i16 = i5522;
                                        iVar = iVar2;
                                        rVar2.f28934p = j2022;
                                        i49 = i51;
                                        i50 = i5622;
                                    } else {
                                        i17 = i48;
                                        i18 = i41;
                                        arrayList4 = arrayList6;
                                        c2791a = c2791a3;
                                        arrayList3 = arrayList9;
                                        i16 = i33;
                                        i19 = size6;
                                        sparseArray2 = sparseArray3;
                                        iVar = iVar5;
                                    }
                                    i48 = i17 + 1;
                                    iVar5 = iVar;
                                    size6 = i19;
                                    sparseArray3 = sparseArray2;
                                    arrayList6 = arrayList4;
                                    c2791a3 = c2791a;
                                    i41 = i18;
                                    arrayList9 = arrayList3;
                                    i33 = i16;
                                    i13 = 1953658222;
                                } else {
                                    i11 = i41;
                                    arrayList = arrayList6;
                                    C2791a c2791a4 = c2791a3;
                                    ArrayList arrayList11 = arrayList9;
                                    i10 = i33;
                                    sparseArray = sparseArray3;
                                    p pVar5 = iVar5.f28823d.f28936a;
                                    f fVar5 = rVar2.f28919a;
                                    fVar5.getClass();
                                    q[] qVarArr = pVar5.f28913k;
                                    if (qVarArr == null) {
                                        qVar2 = null;
                                    } else {
                                        qVar2 = qVarArr[fVar5.f28812a];
                                    }
                                    C2792b j21 = c2791a4.j(1935763834);
                                    if (j21 != null) {
                                        qVar2.getClass();
                                        u uVar7 = j21.f28801h0;
                                        uVar7.F(8);
                                        if ((uVar7.g() & 1) == 1) {
                                            uVar7.G(8);
                                        }
                                        int u10 = uVar7.u();
                                        int x11 = uVar7.x();
                                        if (x11 <= rVar2.f28923e) {
                                            int i57 = qVar2.f28917d;
                                            if (u10 == 0) {
                                                boolean[] zArr3 = rVar2.f28930l;
                                                i15 = 0;
                                                for (int i58 = 0; i58 < x11; i58++) {
                                                    int u11 = uVar7.u();
                                                    i15 += u11;
                                                    if (u11 > i57) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    zArr3[i58] = z13;
                                                }
                                                z11 = false;
                                            } else {
                                                if (u10 > i57) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                i15 = u10 * x11;
                                                z11 = false;
                                                Arrays.fill(rVar2.f28930l, 0, x11, z12);
                                            }
                                            Arrays.fill(rVar2.f28930l, x11, rVar2.f28923e, z11);
                                            if (i15 > 0) {
                                                rVar2.f28932n.C(i15);
                                                rVar2.f28929k = true;
                                                rVar2.f28933o = true;
                                            }
                                        } else {
                                            StringBuilder q10 = android.gov.nist.core.a.q("Saiz sample count ", x11, " is greater than fragment sample count");
                                            q10.append(rVar2.f28923e);
                                            throw O.a(q10.toString(), null);
                                        }
                                    }
                                    C2792b j22 = c2791a4.j(1935763823);
                                    if (j22 != null) {
                                        u uVar8 = j22.f28801h0;
                                        uVar8.F(8);
                                        int g13 = uVar8.g();
                                        if ((g13 & 1) == 1) {
                                            uVar8.G(8);
                                        }
                                        int x12 = uVar8.x();
                                        if (x12 == 1) {
                                            int h10 = AbstractC6266a.h(g13);
                                            long j23 = rVar2.f28921c;
                                            if (h10 == 0) {
                                                j10 = uVar8.v();
                                            } else {
                                                j10 = uVar8.y();
                                            }
                                            rVar2.f28921c = j23 + j10;
                                        } else {
                                            throw O.a("Unexpected saio entry count: " + x12, null);
                                        }
                                    }
                                    byte[] bArr = null;
                                    C2792b j24 = c2791a4.j(1936027235);
                                    if (j24 != null) {
                                        e(j24.f28801h0, 0, rVar2);
                                    }
                                    if (qVar2 != null) {
                                        str2 = qVar2.f28915b;
                                    } else {
                                        str2 = null;
                                    }
                                    u uVar9 = null;
                                    u uVar10 = null;
                                    int i59 = 0;
                                    while (i59 < arrayList11.size()) {
                                        ArrayList arrayList12 = arrayList11;
                                        C2792b c2792b4 = (C2792b) arrayList12.get(i59);
                                        u uVar11 = c2792b4.f28801h0;
                                        int i60 = c2792b4.f48626Z;
                                        if (i60 == 1935828848) {
                                            uVar11.F(12);
                                            if (uVar11.g() == 1936025959) {
                                                uVar10 = uVar11;
                                            }
                                        } else if (i60 == 1936158820) {
                                            uVar11.F(12);
                                            if (uVar11.g() == 1936025959) {
                                                uVar9 = uVar11;
                                            }
                                        }
                                        i59++;
                                        arrayList11 = arrayList12;
                                    }
                                    ArrayList arrayList13 = arrayList11;
                                    if (uVar10 != null && uVar9 != null) {
                                        uVar10.F(8);
                                        int h11 = AbstractC6266a.h(uVar10.g());
                                        uVar10.G(4);
                                        if (h11 == 1) {
                                            uVar10.G(4);
                                        }
                                        if (uVar10.g() == 1) {
                                            uVar9.F(8);
                                            int h12 = AbstractC6266a.h(uVar9.g());
                                            uVar9.G(4);
                                            if (h12 == 1) {
                                                if (uVar9.v() == 0) {
                                                    throw O.b("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (h12 >= 2) {
                                                uVar9.G(4);
                                            }
                                            if (uVar9.v() == 1) {
                                                uVar9.G(1);
                                                int u12 = uVar9.u();
                                                int i61 = (u12 & 240) >> 4;
                                                int i62 = u12 & 15;
                                                if (uVar9.u() == 1) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    int u13 = uVar9.u();
                                                    byte[] bArr2 = new byte[16];
                                                    uVar9.e(bArr2, 0, 16);
                                                    if (u13 == 0) {
                                                        int u14 = uVar9.u();
                                                        bArr = new byte[u14];
                                                        uVar9.e(bArr, 0, u14);
                                                    }
                                                    rVar2.f28929k = true;
                                                    rVar2.f28931m = new q(z10, str2, u13, bArr2, i61, i62, bArr);
                                                    size = arrayList13.size();
                                                    for (i14 = 0; i14 < size; i14++) {
                                                        C2792b c2792b5 = (C2792b) arrayList13.get(i14);
                                                        if (c2792b5.f48626Z == 1970628964) {
                                                            u uVar12 = c2792b5.f28801h0;
                                                            uVar12.F(8);
                                                            byte[] bArr3 = this.f28845g;
                                                            uVar12.e(bArr3, 0, 16);
                                                            if (Arrays.equals(bArr3, f28832F)) {
                                                                e(uVar12, 16, rVar2);
                                                            }
                                                        }
                                                    }
                                                    jVar2 = this;
                                                }
                                            } else {
                                                throw O.b("Entry count in sgpd != 1 (unsupported).");
                                            }
                                        } else {
                                            throw O.b("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                    size = arrayList13.size();
                                    while (i14 < size) {
                                    }
                                    jVar2 = this;
                                }
                            }
                        }
                    }
                    arrayList2 = arrayList8;
                    i12 = size5;
                    i11 = i41;
                    arrayList = arrayList6;
                    i10 = i33;
                    sparseArray = sparseArray3;
                    jVar2 = jVar3;
                    i41 = i11 + 1;
                    jVar3 = jVar2;
                    size5 = i12;
                    arrayList8 = arrayList2;
                    sparseArray3 = sparseArray;
                    arrayList6 = arrayList;
                    i33 = i10;
                }
                ArrayList arrayList14 = arrayList6;
                SparseArray sparseArray5 = sparseArray3;
                jVar = jVar3;
                C5063p c12 = c(arrayList14);
                if (c12 != null) {
                    int size7 = sparseArray5.size();
                    int i63 = 0;
                    while (i63 < size7) {
                        SparseArray sparseArray6 = sparseArray5;
                        i iVar6 = (i) sparseArray6.valueAt(i63);
                        p pVar6 = iVar6.f28823d.f28936a;
                        f fVar6 = iVar6.f28821b.f28919a;
                        int i64 = AbstractC5530A.f45131a;
                        int i65 = fVar6.f28812a;
                        q[] qVarArr2 = pVar6.f28913k;
                        if (qVarArr2 == null) {
                            qVar = null;
                        } else {
                            qVar = qVarArr2[i65];
                        }
                        if (qVar != null) {
                            str = qVar.f28915b;
                        } else {
                            str = null;
                        }
                        C5063p a5 = c12.a(str);
                        p2.r b10 = iVar6.f28823d.f28936a.f28908f.b();
                        b10.f42240n = a5;
                        iVar6.f28820a.b(new C5065s(b10));
                        i63++;
                        sparseArray5 = sparseArray6;
                    }
                }
                SparseArray sparseArray7 = sparseArray5;
                if (jVar.f28858t != -9223372036854775807L) {
                    int size8 = sparseArray7.size();
                    for (int i66 = 0; i66 < size8; i66++) {
                        i iVar7 = (i) sparseArray7.valueAt(i66);
                        long j25 = jVar.f28858t;
                        int i67 = iVar7.f28825f;
                        while (true) {
                            r rVar3 = iVar7.f28821b;
                            if (i67 < rVar3.f28923e && rVar3.f28927i[i67] <= j25) {
                                if (rVar3.f28928j[i67]) {
                                    iVar7.f28828i = i67;
                                }
                                i67++;
                            }
                        }
                    }
                    jVar.f28858t = -9223372036854775807L;
                }
            } else {
                jVar = jVar3;
                if (!arrayDeque.isEmpty()) {
                    ((C2791a) arrayDeque.peek()).f28800j0.add(c2791a2);
                }
            }
            jVar3 = jVar;
        }
    }

    @Override // L2.q
    public final boolean g(L2.r rVar) {
        return k.g(rVar, true, false);
    }

    @Override // L2.q
    public final void h(long j6, long j10) {
        SparseArray sparseArray = this.f28841c;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) sparseArray.valueAt(i10)).d();
        }
        this.f28850l.clear();
        this.f28857s = 0;
        this.f28858t = j10;
        this.f28849k.clear();
        this.f28851m = 0;
        this.f28854p = 0;
    }

    @Override // L2.q
    public final L2.q b() {
        return this;
    }

    @Override // L2.q
    public final void release() {
    }
}
