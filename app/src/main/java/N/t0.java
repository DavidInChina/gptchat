package N;

import E0.AbstractC0461u;
import H0.AbstractC0696o0;
import H0.C0667a0;
import H0.C0689l;
import H0.C0703s0;
import H0.U0;
import L.AbstractC0857k0;
import L.P0;
import L.Q0;
import L.R0;
import N0.C1044c;
import N0.C1045d;
import N0.C1046e;
import Z.C1724m0;
import Z.o1;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.view.ActionMode;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import x0.AbstractC6263a;
import x0.C6264b;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final R0 f12413a;

    /* renamed from: d  reason: collision with root package name */
    public P0 f12416d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f12417e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC0696o0 f12418f;

    /* renamed from: g  reason: collision with root package name */
    public U0 f12419g;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC6263a f12420h;

    /* renamed from: i  reason: collision with root package name */
    public p0.l f12421i;

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f12422j;

    /* renamed from: k  reason: collision with root package name */
    public long f12423k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f12424l;

    /* renamed from: m  reason: collision with root package name */
    public long f12425m;

    /* renamed from: n  reason: collision with root package name */
    public final C1724m0 f12426n;

    /* renamed from: o  reason: collision with root package name */
    public final C1724m0 f12427o;

    /* renamed from: r  reason: collision with root package name */
    public p0 f12430r;

    /* renamed from: b  reason: collision with root package name */
    public T0.s f12414b = AbstractC0857k0.f10218c;

    /* renamed from: c  reason: collision with root package name */
    public wf.k f12415c = U.f12257k0;

    /* renamed from: p  reason: collision with root package name */
    public int f12428p = -1;

    /* renamed from: q  reason: collision with root package name */
    public T0.z f12429q = new T0.z((String) null, 0, 7);

    /* renamed from: s  reason: collision with root package name */
    public final r0 f12431s = new r0(this, 1);

    /* renamed from: t  reason: collision with root package name */
    public final s0 f12432t = new s0(this);

    public t0(R0 r02) {
        this.f12413a = r02;
        T0.z zVar = new T0.z((String) null, 0L, 7);
        o1 o1Var = o1.f22665a;
        this.f12417e = AbstractC4828h.Z(zVar, o1Var);
        this.f12422j = AbstractC4828h.Z(Boolean.TRUE, o1Var);
        long j6 = C5251c.f43619b;
        this.f12423k = j6;
        this.f12425m = j6;
        this.f12426n = AbstractC4828h.Z(null, o1Var);
        this.f12427o = AbstractC4828h.Z(null, o1Var);
    }

    public static final void a(t0 t0Var, L.Y y10) {
        t0Var.f12426n.setValue(y10);
    }

    public static final long b(t0 t0Var, T0.z zVar, long j6, boolean z10, boolean z11, AbstractC1038w abstractC1038w, boolean z12) {
        Q0 d10;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        C1034s c1034s;
        boolean z13;
        boolean z14;
        L.Z z15;
        AbstractC6263a abstractC6263a;
        int i14;
        P0 p02 = t0Var.f12416d;
        if (p02 != null && (d10 = p02.d()) != null) {
            T0.s sVar = t0Var.f12414b;
            long j11 = zVar.f16831b;
            int i15 = N0.D.f12484c;
            int b10 = sVar.b((int) (j11 >> 32));
            T0.s sVar2 = t0Var.f12414b;
            long j12 = zVar.f16831b;
            long e10 = U3.f.e(b10, sVar2.b((int) (j12 & 4294967295L)));
            int b11 = d10.b(j6, false);
            if (!z11 && !z10) {
                i10 = (int) (e10 >> 32);
            } else {
                i10 = b11;
            }
            if (z11 && !z10) {
                i11 = (int) (e10 & 4294967295L);
            } else {
                i11 = b11;
            }
            p0 p0Var = t0Var.f12430r;
            if (!z10 && p0Var != null && (i14 = t0Var.f12428p) != -1) {
                i12 = i14;
            } else {
                i12 = -1;
            }
            N0.C c10 = d10.f10054a;
            if (z10) {
                c1034s = null;
                j10 = j12;
                i13 = b11;
            } else {
                i13 = b11;
                int i16 = (int) (e10 >> 32);
                j10 = j12;
                r rVar = new r(AbstractC4828h.P(c10, i16), i16, 1L);
                int i17 = (int) (e10 & 4294967295L);
                c1034s = new C1034s(rVar, new r(AbstractC4828h.P(c10, i17), i17, 1L), N0.D.f(e10));
            }
            p0 p0Var2 = new p0(z11, 1, 1, c1034s, new C1033q(1L, 1, i10, i11, i12, c10));
            if (!p0Var2.e(p0Var)) {
                return j10;
            }
            t0Var.f12430r = p0Var2;
            t0Var.f12428p = i13;
            C1034s a5 = ((C1035t) abstractC1038w).a(p0Var2);
            long e11 = U3.f.e(t0Var.f12414b.a(a5.f12408a.f12404b), t0Var.f12414b.a(a5.f12409b.f12404b));
            long j13 = j10;
            if (N0.D.a(e11, j13)) {
                return j13;
            }
            if (N0.D.f(e11) != N0.D.f(j13) && N0.D.a(U3.f.e((int) (e11 & 4294967295L), (int) (e11 >> 32)), j13)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (N0.D.b(e11) && N0.D.b(j13)) {
                z14 = true;
            } else {
                z14 = false;
            }
            C1046e c1046e = zVar.f16830a;
            if (z12 && c1046e.f12512Y.length() > 0 && !z13 && !z14 && (abstractC6263a = t0Var.f12420h) != null) {
                ((C6264b) abstractC6263a).a(M3.H.f11535i);
            }
            T0.z d11 = d(c1046e, e11);
            t0Var.f12415c.invoke(d11);
            if (N0.D.b(d11.f16831b)) {
                z15 = L.Z.f10087h0;
            } else {
                z15 = L.Z.f10086Z;
            }
            t0Var.m(z15);
            P0 p03 = t0Var.f12416d;
            if (p03 != null) {
                p03.f10045q.setValue(Boolean.valueOf(z12));
            }
            P0 p04 = t0Var.f12416d;
            if (p04 != null) {
                p04.f10041m.setValue(Boolean.valueOf(Ng.H.t(t0Var, true)));
            }
            P0 p05 = t0Var.f12416d;
            if (p05 != null) {
                p05.f10042n.setValue(Boolean.valueOf(Ng.H.t(t0Var, false)));
            }
            return e11;
        }
        return N0.D.f12483b;
    }

    public static T0.z d(C1046e c1046e, long j6) {
        return new T0.z(c1046e, j6, (N0.D) null);
    }

    public final void c(boolean z10) {
        if (N0.D.b(j().f16831b)) {
            return;
        }
        AbstractC0696o0 abstractC0696o0 = this.f12418f;
        if (abstractC0696o0 != null) {
            ((C0689l) abstractC0696o0).a(U3.f.W(j()));
        }
        if (!z10) {
            return;
        }
        int d10 = N0.D.d(j().f16831b);
        this.f12415c.invoke(d(j().f16830a, U3.f.e(d10, d10)));
        m(L.Z.f10085Y);
    }

    public final void e() {
        if (N0.D.b(j().f16831b)) {
            return;
        }
        AbstractC0696o0 abstractC0696o0 = this.f12418f;
        if (abstractC0696o0 != null) {
            ((C0689l) abstractC0696o0).a(U3.f.W(j()));
        }
        C1046e Z10 = U3.f.Z(j(), j().f16830a.f12512Y.length());
        C1046e Y7 = U3.f.Y(j(), j().f16830a.f12512Y.length());
        C1044c c1044c = new C1044c(Z10);
        c1044c.b(Y7);
        C1046e i10 = c1044c.i();
        int e10 = N0.D.e(j().f16831b);
        this.f12415c.invoke(d(i10, U3.f.e(e10, e10)));
        m(L.Z.f10085Y);
        R0 r02 = this.f12413a;
        if (r02 != null) {
            r02.f10062f = true;
        }
    }

    public final void f(C5251c c5251c) {
        L.Z z10;
        Q0 q02;
        int i10;
        if (!N0.D.b(j().f16831b)) {
            P0 p02 = this.f12416d;
            if (p02 != null) {
                q02 = p02.d();
            } else {
                q02 = null;
            }
            if (c5251c != null && q02 != null) {
                i10 = this.f12414b.a(q02.b(c5251c.f43623a, true));
            } else {
                i10 = N0.D.d(j().f16831b);
            }
            this.f12415c.invoke(T0.z.a(j(), null, U3.f.e(i10, i10), 5));
        }
        if (c5251c != null && j().f16830a.f12512Y.length() > 0) {
            z10 = L.Z.f10087h0;
        } else {
            z10 = L.Z.f10085Y;
        }
        m(z10);
        o(false);
    }

    public final void g(boolean z10) {
        p0.l lVar;
        P0 p02 = this.f12416d;
        if (p02 != null && !p02.b() && (lVar = this.f12421i) != null) {
            lVar.a();
        }
        this.f12429q = j();
        o(z10);
        m(L.Z.f10086Z);
    }

    public final C5251c h() {
        return (C5251c) this.f12427o.getValue();
    }

    public final long i(boolean z10) {
        Q0 d10;
        N0.C c10;
        C1046e c1046e;
        long j6;
        L.w0 w0Var;
        P0 p02 = this.f12416d;
        if (p02 != null && (d10 = p02.d()) != null && (c10 = d10.f10054a) != null) {
            P0 p03 = this.f12416d;
            if (p03 != null && (w0Var = p03.f10029a) != null) {
                c1046e = w0Var.f10339a;
            } else {
                c1046e = null;
            }
            if (c1046e == null) {
                return C5251c.f43621d;
            }
            if (!AbstractC3557B.K(c1046e.f12512Y, c10.f12477a.f12467a.f12512Y)) {
                return C5251c.f43621d;
            }
            T0.z j10 = j();
            if (z10) {
                long j11 = j10.f16831b;
                int i10 = N0.D.f12484c;
                j6 = j11 >> 32;
            } else {
                long j12 = j10.f16831b;
                int i11 = N0.D.f12484c;
                j6 = j12 & 4294967295L;
            }
            return U3.f.X(c10, this.f12414b.b((int) j6), z10, N0.D.f(j().f16831b));
        }
        return C5251c.f43621d;
    }

    public final T0.z j() {
        return (T0.z) this.f12417e.getValue();
    }

    public final void k() {
        U0 u02 = this.f12419g;
        if (u02 != null && ((C0667a0) u02).f6905d == 1 && u02 != null) {
            C0667a0 c0667a0 = (C0667a0) u02;
            c0667a0.f6905d = 2;
            ActionMode actionMode = c0667a0.f6903b;
            if (actionMode != null) {
                actionMode.finish();
            }
            c0667a0.f6903b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r16 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        CharSequence charSequence;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        byte b10 = 2;
        AbstractC0696o0 abstractC0696o0 = this.f12418f;
        if (abstractC0696o0 != null) {
            ClipData primaryClip = ((C0689l) abstractC0696o0).f6969a.getPrimaryClip();
            C1046e c1046e = null;
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt != null) {
                    charSequence = itemAt.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    if (!(charSequence instanceof Spanned)) {
                        c1046e = new C1046e(charSequence.toString(), null, 6);
                    } else {
                        Spanned spanned = (Spanned) charSequence;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int l32 = kf.q.l3(annotationArr);
                        byte b11 = 4;
                        if (l32 >= 0) {
                            int i11 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i11];
                                if (!AbstractC3557B.K(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    z10 = z13;
                                } else {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    C0703s0 c0703s0 = new C0703s0(annotation.getValue());
                                    long j6 = r0.r.f44263k;
                                    long j10 = j6;
                                    long j11 = Z0.n.f22810c;
                                    long j12 = j11;
                                    S0.D d10 = null;
                                    S0.z zVar = null;
                                    S0.A a5 = null;
                                    String str = null;
                                    Y0.a aVar = null;
                                    Y0.p pVar = null;
                                    Y0.j jVar = null;
                                    r0.K k10 = null;
                                    while (true) {
                                        Parcel parcel = c0703s0.f7033a;
                                        if (parcel.dataAvail() <= 1) {
                                            break;
                                        }
                                        byte readByte = parcel.readByte();
                                        if (readByte == 1) {
                                            if (parcel.dataAvail() < 8) {
                                                break;
                                            }
                                            j6 = parcel.readLong();
                                            int i12 = r0.r.f44264l;
                                        } else if (readByte == b10) {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            j11 = c0703s0.a();
                                        } else {
                                            int i13 = 3;
                                            if (readByte == 3) {
                                                if (parcel.dataAvail() < b11) {
                                                    break;
                                                }
                                                d10 = new S0.D(parcel.readInt());
                                                b10 = 2;
                                            } else if (readByte == b11) {
                                                if (parcel.dataAvail() < 1) {
                                                    break;
                                                }
                                                byte readByte2 = parcel.readByte();
                                                if (readByte2 == 0 || readByte2 != 1) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 1;
                                                }
                                                zVar = new S0.z(i10);
                                                b10 = 2;
                                            } else if (readByte == 5) {
                                                if (parcel.dataAvail() < 1) {
                                                    break;
                                                }
                                                byte readByte3 = parcel.readByte();
                                                if (readByte3 != 0) {
                                                    if (readByte3 == 1) {
                                                        i13 = 1;
                                                    } else if (readByte3 != 3) {
                                                        if (readByte3 == 2) {
                                                            i13 = 2;
                                                        }
                                                    }
                                                    a5 = new S0.A(i13);
                                                    b10 = 2;
                                                }
                                                i13 = 0;
                                                a5 = new S0.A(i13);
                                                b10 = 2;
                                            } else if (readByte == 6) {
                                                str = parcel.readString();
                                                b10 = 2;
                                            } else if (readByte == 7) {
                                                if (parcel.dataAvail() < 5) {
                                                    break;
                                                }
                                                j12 = c0703s0.a();
                                                b10 = 2;
                                            } else if (readByte == 8) {
                                                if (parcel.dataAvail() < b11) {
                                                    break;
                                                }
                                                aVar = new Y0.a(parcel.readFloat());
                                                b10 = 2;
                                            } else if (readByte == 9) {
                                                if (parcel.dataAvail() < 8) {
                                                    break;
                                                }
                                                pVar = new Y0.p(parcel.readFloat(), parcel.readFloat());
                                                b10 = 2;
                                            } else if (readByte == 10) {
                                                if (parcel.dataAvail() < 8) {
                                                    break;
                                                }
                                                j10 = parcel.readLong();
                                                int i14 = r0.r.f44264l;
                                                b10 = 2;
                                            } else {
                                                if (readByte == 11) {
                                                    if (parcel.dataAvail() < b11) {
                                                        break;
                                                    }
                                                    int readInt = parcel.readInt();
                                                    if ((readInt & 2) != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if ((readInt & 1) != 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    Y0.j jVar2 = Y0.j.f22033d;
                                                    Y0.j jVar3 = Y0.j.f22032c;
                                                    if (z11 && z12) {
                                                        z10 = false;
                                                        List G02 = AbstractC4344b.G0(jVar2, jVar3);
                                                        Integer num = 0;
                                                        int size = G02.size();
                                                        for (int i15 = 0; i15 < size; i15++) {
                                                            num = Integer.valueOf(num.intValue() | ((Y0.j) G02.get(i15)).f22034a);
                                                        }
                                                        jVar = new Y0.j(num.intValue());
                                                    } else {
                                                        z10 = false;
                                                        if (z11) {
                                                            jVar = jVar2;
                                                        } else if (z12) {
                                                            jVar = jVar3;
                                                        } else {
                                                            jVar = Y0.j.f22031b;
                                                        }
                                                    }
                                                } else {
                                                    z10 = false;
                                                    if (readByte == 12) {
                                                        if (parcel.dataAvail() < 20) {
                                                            break;
                                                        }
                                                        long readLong = parcel.readLong();
                                                        int i16 = r0.r.f44264l;
                                                        k10 = new r0.K(readLong, R4.b.r(parcel.readFloat(), parcel.readFloat()), parcel.readFloat());
                                                    }
                                                }
                                                b10 = 2;
                                                b11 = 4;
                                            }
                                        }
                                    }
                                    arrayList.add(new C1045d(new N0.y(j6, j11, d10, zVar, a5, null, str, j12, aVar, pVar, null, j10, jVar, k10, 49152), spanStart, spanEnd));
                                }
                                if (i11 == l32) {
                                    break;
                                }
                                i11++;
                                z13 = z10;
                                b10 = 2;
                                b11 = 4;
                            }
                        }
                        c1046e = new C1046e(charSequence.toString(), arrayList, 4);
                    }
                }
            } else {
                c1046e = null;
            }
            if (c1046e != null) {
                C1044c c1044c = new C1044c(U3.f.Z(j(), j().f16830a.f12512Y.length()));
                c1044c.b(c1046e);
                C1046e i17 = c1044c.i();
                C1046e Y7 = U3.f.Y(j(), j().f16830a.f12512Y.length());
                C1044c c1044c2 = new C1044c(i17);
                c1044c2.b(Y7);
                C1046e i18 = c1044c2.i();
                int length = c1046e.f12512Y.length() + N0.D.e(j().f16831b);
                this.f12415c.invoke(d(i18, U3.f.e(length, length)));
                m(L.Z.f10085Y);
                R0 r02 = this.f12413a;
                if (r02 != null) {
                    r02.f10062f = true;
                }
            }
        }
    }

    public final void m(L.Z z10) {
        P0 p02 = this.f12416d;
        if (p02 != null) {
            if (p02.a() == z10) {
                p02 = null;
            }
            if (p02 != null) {
                p02.f10039k.setValue(z10);
            }
        }
    }

    public final void n() {
        L.K k10;
        L.K k11;
        L.K k12;
        L.K k13;
        L.K k14;
        L.K k15;
        C5252d c5252d;
        long j6;
        long j10;
        float f6;
        AbstractC0461u c10;
        float f10;
        N0.C c11;
        AbstractC0461u c12;
        float f11;
        N0.C c13;
        AbstractC0461u c14;
        AbstractC0461u c15;
        AbstractC0696o0 abstractC0696o0;
        ClipDescription primaryClipDescription;
        P0 p02 = this.f12416d;
        if (p02 != null && !((Boolean) p02.f10045q.getValue()).booleanValue()) {
            return;
        }
        P0 p03 = null;
        if (!N0.D.b(j().f16831b)) {
            k10 = new L.K(this, 4);
        } else {
            k10 = null;
        }
        boolean b10 = N0.D.b(j().f16831b);
        C1724m0 c1724m0 = this.f12422j;
        if (!b10 && ((Boolean) c1724m0.getValue()).booleanValue()) {
            k11 = new L.K(this, 5);
        } else {
            k11 = null;
        }
        if (((Boolean) c1724m0.getValue()).booleanValue() && (abstractC0696o0 = this.f12418f) != null && (primaryClipDescription = ((C0689l) abstractC0696o0).f6969a.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            k12 = new L.K(this, 6);
        } else {
            k12 = null;
        }
        if (N0.D.c(j().f16831b) != j().f16830a.f12512Y.length()) {
            k13 = new L.K(this, 7);
        } else {
            k13 = null;
        }
        U0 u02 = this.f12419g;
        if (u02 != null) {
            P0 p04 = this.f12416d;
            if (p04 != null) {
                if (!p04.f10044p) {
                    p03 = p04;
                }
                if (p03 != null) {
                    int b11 = this.f12414b.b((int) (j().f16831b >> 32));
                    int b12 = this.f12414b.b((int) (j().f16831b & 4294967295L));
                    P0 p05 = this.f12416d;
                    if (p05 != null && (c15 = p05.c()) != null) {
                        j6 = c15.M(i(true));
                    } else {
                        j6 = C5251c.f43619b;
                    }
                    P0 p06 = this.f12416d;
                    if (p06 != null && (c14 = p06.c()) != null) {
                        j10 = c14.M(i(false));
                    } else {
                        j10 = C5251c.f43619b;
                    }
                    P0 p07 = this.f12416d;
                    float f12 = 0.0f;
                    if (p07 != null && (c12 = p07.c()) != null) {
                        Q0 d10 = p03.d();
                        if (d10 != null && (c13 = d10.f10054a) != null) {
                            f11 = c13.c(b11).f43626b;
                            k15 = k11;
                            k14 = k13;
                        } else {
                            k15 = k11;
                            k14 = k13;
                            f11 = 0.0f;
                        }
                        f6 = C5251c.e(c12.M(R4.b.r(0.0f, f11)));
                    } else {
                        k15 = k11;
                        k14 = k13;
                        f6 = 0.0f;
                    }
                    P0 p08 = this.f12416d;
                    if (p08 != null && (c10 = p08.c()) != null) {
                        Q0 d11 = p03.d();
                        if (d11 != null && (c11 = d11.f10054a) != null) {
                            f10 = c11.c(b12).f43626b;
                        } else {
                            f10 = 0.0f;
                        }
                        f12 = C5251c.e(c10.M(R4.b.r(0.0f, f10)));
                    }
                    c5252d = new C5252d(Math.min(C5251c.d(j6), C5251c.d(j10)), Math.min(f6, f12), Math.max(C5251c.d(j6), C5251c.d(j10)), (p03.f10029a.f10345g.b() * 25) + Math.max(C5251c.e(j6), C5251c.e(j10)));
                    ((C0667a0) u02).a(c5252d, k10, k12, k15, k14);
                }
            }
            k15 = k11;
            k14 = k13;
            c5252d = C5252d.f43624e;
            ((C0667a0) u02).a(c5252d, k10, k12, k15, k14);
        }
    }

    public final void o(boolean z10) {
        P0 p02 = this.f12416d;
        if (p02 != null) {
            p02.f10040l.setValue(Boolean.valueOf(z10));
        }
        if (z10) {
            n();
        } else {
            k();
        }
    }
}
