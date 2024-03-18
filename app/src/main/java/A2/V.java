package A2;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import h.C3276b;
import io.sentry.C3636c1;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import jh.H1;
import livekit.org.webrtc.MediaStreamTrack;
import m.C4507D;
import m.RunnableC4517N;
import p2.C5052e;
import p2.C5053f;
import p2.C5065s;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import x8.k0;
import y.AbstractC6463a;
import y2.C6503F;
import y2.C6505H;
import y2.C6521h;
import y2.SurfaceHolder$CallbackC6500C;
import y2.j0;
import z2.C6755D;

/* loaded from: classes.dex */
public final class V extends C2.q implements y2.Q {

    /* renamed from: L1  reason: collision with root package name */
    public final Context f497L1;

    /* renamed from: M1  reason: collision with root package name */
    public final U3.l f498M1;
    public final AbstractC0075t N1;

    /* renamed from: O1  reason: collision with root package name */
    public int f499O1;

    /* renamed from: P1  reason: collision with root package name */
    public boolean f500P1;

    /* renamed from: Q1  reason: collision with root package name */
    public boolean f501Q1;

    /* renamed from: R1  reason: collision with root package name */
    public C5065s f502R1;

    /* renamed from: S1  reason: collision with root package name */
    public C5065s f503S1;

    /* renamed from: U1  reason: collision with root package name */
    public long f504U1;

    /* renamed from: V1  reason: collision with root package name */
    public boolean f505V1;

    /* renamed from: W1  reason: collision with root package name */
    public boolean f506W1;

    /* renamed from: X1  reason: collision with root package name */
    public C6505H f507X1;

    public V(Context context, H1 h12, Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C, S s10) {
        super(1, h12, 44100.0f);
        this.f497L1 = context.getApplicationContext();
        this.N1 = s10;
        this.f498M1 = new U3.l(handler, surfaceHolder$CallbackC6500C);
        s10.f483t = new F4.a(this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [x8.K, x8.H] */
    public static k0 v0(C2.s sVar, C5065s c5065s, boolean z10, AbstractC0075t abstractC0075t) {
        List list;
        C2.m mVar;
        if (c5065s.f42319q0 == null) {
            x8.L l10 = x8.N.f49523Z;
            return k0.f49573j0;
        }
        if (((S) abstractC0075t).h(c5065s) != 0) {
            List e10 = C2.y.e("audio/raw", false, false);
            if (e10.isEmpty()) {
                mVar = null;
            } else {
                mVar = (C2.m) e10.get(0);
            }
            if (mVar != null) {
                return x8.N.u0(mVar);
            }
        }
        Pattern pattern = C2.y.f2635a;
        ((C2.r) sVar).getClass();
        List e11 = C2.y.e(c5065s.f42319q0, z10, false);
        String b10 = C2.y.b(c5065s);
        if (b10 == null) {
            x8.L l11 = x8.N.f49523Z;
            list = k0.f49573j0;
        } else {
            list = C2.y.e(b10, z10, false);
        }
        x8.L l12 = x8.N.f49523Z;
        ?? h10 = new x8.H();
        h10.f0(e11);
        h10.f0(list);
        return h10.i0();
    }

    @Override // C2.q
    public final C6521h C(C2.m mVar, C5065s c5065s, C5065s c5065s2) {
        boolean z10;
        C6521h b10 = mVar.b(c5065s, c5065s2);
        int i10 = 0;
        if (this.f2585K0 == null && o0(c5065s2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = b10.f50607e;
        if (z10) {
            i11 |= 32768;
        }
        if (u0(c5065s2, mVar) > this.f499O1) {
            i11 |= 64;
        }
        int i12 = i11;
        if (i12 == 0) {
            i10 = b10.f50606d;
        }
        return new C6521h(mVar.f2547a, c5065s, c5065s2, i10, i12);
    }

    @Override // C2.q
    public final float M(float f6, C5065s[] c5065sArr) {
        int i10 = -1;
        for (C5065s c5065s : c5065sArr) {
            int i11 = c5065s.f42298E0;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f6 * i10;
    }

    @Override // C2.q
    public final ArrayList N(C2.s sVar, C5065s c5065s, boolean z10) {
        k0 v02 = v0(sVar, c5065s, z10, this.N1);
        Pattern pattern = C2.y.f2635a;
        ArrayList arrayList = new ArrayList(v02);
        Collections.sort(arrayList, new C2.t(0, new C3276b(12, c5065s)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    @Override // C2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2.h O(C2.m mVar, C5065s c5065s, MediaCrypto mediaCrypto, float f6) {
        boolean z10;
        boolean z11;
        MediaFormat mediaFormat;
        C5065s c5065s2;
        C5065s[] c5065sArr = this.f50572o0;
        c5065sArr.getClass();
        int u02 = u0(c5065s, mVar);
        if (c5065sArr.length != 1) {
            for (C5065s c5065s3 : c5065sArr) {
                if (mVar.b(c5065s, c5065s3).f50606d != 0) {
                    u02 = Math.max(u02, u0(c5065s3, mVar));
                }
            }
        }
        this.f499O1 = u02;
        int i10 = AbstractC5530A.f45131a;
        String str = mVar.f2547a;
        if (i10 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC5530A.f45133c)) {
            String str2 = AbstractC5530A.f45132b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
                this.f500P1 = z10;
                if (str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.f501Q1 = z11;
                int i11 = this.f499O1;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", mVar.f2549c);
                int i12 = c5065s.f42297D0;
                mediaFormat.setInteger("channel-count", i12);
                int i13 = c5065s.f42298E0;
                mediaFormat.setInteger("sample-rate", i13);
                r9.y.X0(mediaFormat, c5065s.f42321s0);
                r9.y.L0(mediaFormat, "max-input-size", i11);
                if (i10 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f6 != -1.0f) {
                        if (i10 == 23) {
                            String str3 = AbstractC5530A.f45134d;
                            if (!"ZTE B2017G".equals(str3)) {
                            }
                        }
                        mediaFormat.setFloat("operating-rate", f6);
                    }
                }
                String str4 = c5065s.f42319q0;
                if (i10 <= 28 && "audio/ac4".equals(str4)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i10 >= 24) {
                    p2.r rVar = new p2.r();
                    rVar.f42237k = "audio/raw";
                    rVar.f42250x = i12;
                    rVar.f42251y = i13;
                    rVar.f42252z = 4;
                    if (((S) this.N1).h(new C5065s(rVar)) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if (i10 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (!"audio/raw".equals(mVar.f2548b) && !"audio/raw".equals(str4)) {
                    c5065s2 = c5065s;
                } else {
                    c5065s2 = null;
                }
                this.f503S1 = c5065s2;
                return new C2.h(mVar, mediaFormat, c5065s, null, mediaCrypto);
            }
        }
        z10 = false;
        this.f500P1 = z10;
        if (str.equals("OMX.google.opus.decoder")) {
        }
        z11 = true;
        this.f501Q1 = z11;
        int i112 = this.f499O1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", mVar.f2549c);
        int i122 = c5065s.f42297D0;
        mediaFormat.setInteger("channel-count", i122);
        int i132 = c5065s.f42298E0;
        mediaFormat.setInteger("sample-rate", i132);
        r9.y.X0(mediaFormat, c5065s.f42321s0);
        r9.y.L0(mediaFormat, "max-input-size", i112);
        if (i10 >= 23) {
        }
        String str42 = c5065s.f42319q0;
        if (i10 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i10 >= 24) {
        }
        if (i10 >= 32) {
        }
        if (!"audio/raw".equals(mVar.f2548b)) {
        }
        c5065s2 = null;
        this.f503S1 = c5065s2;
        return new C2.h(mVar, mediaFormat, c5065s, null, mediaCrypto);
    }

    @Override // C2.q
    public final void P(x2.h hVar) {
        C5065s c5065s;
        J j6;
        if (AbstractC5530A.f45131a >= 29 && (c5065s = hVar.f48639h0) != null && Objects.equals(c5065s.f42319q0, "audio/opus") && this.f2614p1) {
            ByteBuffer byteBuffer = hVar.f48644m0;
            byteBuffer.getClass();
            C5065s c5065s2 = hVar.f48639h0;
            c5065s2.getClass();
            if (byteBuffer.remaining() == 8) {
                int i10 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                S s10 = (S) this.N1;
                AudioTrack audioTrack = s10.f487x;
                if (audioTrack != null && S.o(audioTrack) && (j6 = s10.f485v) != null && j6.f414k) {
                    s10.f487x.setOffloadDelayPadding(c5065s2.f42300G0, i10);
                }
            }
        }
    }

    @Override // C2.q
    public final void U(Exception exc) {
        s2.p.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        U3.l lVar = this.f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        if (handler != null) {
            handler.post(new RunnableC0066j(lVar, exc, 0));
        }
    }

    @Override // C2.q
    public final void V(String str, long j6, long j10) {
        U3.l lVar = this.f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        if (handler != null) {
            handler.post(new RunnableC0067k(lVar, str, j6, j10, 0));
        }
    }

    @Override // C2.q
    public final void W(String str) {
        U3.l lVar = this.f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        if (handler != null) {
            handler.post(new RunnableC4517N(lVar, 9, str));
        }
    }

    @Override // C2.q
    public final C6521h X(C3636c1 c3636c1) {
        C5065s c5065s = (C5065s) c3636c1.f34286h0;
        c5065s.getClass();
        this.f502R1 = c5065s;
        C6521h X10 = super.X(c3636c1);
        U3.l lVar = this.f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        if (handler != null) {
            handler.post(new Q1.n(lVar, c5065s, X10, 7));
        }
        return X10;
    }

    @Override // C2.q
    public final void Y(C5065s c5065s, MediaFormat mediaFormat) {
        int i10;
        int i11;
        C5065s c5065s2 = this.f503S1;
        boolean z10 = true;
        int[] iArr = null;
        if (c5065s2 != null) {
            c5065s = c5065s2;
        } else if (this.f2591Q0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(c5065s.f42319q0)) {
                i10 = c5065s.f42299F0;
            } else if (AbstractC5530A.f45131a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i10 = AbstractC5530A.t(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i10 = 2;
            }
            p2.r rVar = new p2.r();
            rVar.f42237k = "audio/raw";
            rVar.f42252z = i10;
            rVar.f42220A = c5065s.f42300G0;
            rVar.f42221B = c5065s.f42301H0;
            rVar.f42235i = c5065s.f42317o0;
            rVar.f42227a = c5065s.f42308Y;
            rVar.f42228b = c5065s.f42309Z;
            rVar.f42229c = c5065s.f42310h0;
            rVar.f42230d = c5065s.f42311i0;
            rVar.f42231e = c5065s.f42312j0;
            rVar.f42250x = mediaFormat.getInteger("channel-count");
            rVar.f42251y = mediaFormat.getInteger("sample-rate");
            C5065s c5065s3 = new C5065s(rVar);
            boolean z11 = this.f500P1;
            int i12 = c5065s3.f42297D0;
            if (z11 && i12 == 6 && (i11 = c5065s.f42297D0) < 6) {
                iArr = new int[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = i13;
                }
            } else if (this.f501Q1) {
                if (i12 != 3) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                if (i12 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
            c5065s = c5065s3;
        }
        try {
            int i14 = AbstractC5530A.f45131a;
            AbstractC0075t abstractC0075t = this.N1;
            if (i14 >= 29) {
                if (this.f2614p1) {
                    j0 j0Var = this.f50566i0;
                    j0Var.getClass();
                    if (j0Var.f50643a != 0) {
                        j0 j0Var2 = this.f50566i0;
                        j0Var2.getClass();
                        int i15 = j0Var2.f50643a;
                        S s10 = (S) abstractC0075t;
                        s10.getClass();
                        if (i14 < 29) {
                            z10 = false;
                        }
                        Gi.e.n(z10);
                        s10.f475l = i15;
                    }
                }
                S s11 = (S) abstractC0075t;
                s11.getClass();
                if (i14 < 29) {
                    z10 = false;
                }
                Gi.e.n(z10);
                s11.f475l = 0;
            }
            ((S) abstractC0075t).c(c5065s, iArr);
        } catch (C0072p e10) {
            throw e(5001, e10.f582Y, e10, false);
        }
    }

    @Override // C2.q
    public final void Z() {
        this.N1.getClass();
    }

    @Override // y2.Q
    public final long a() {
        if (this.f50570m0 == 2) {
            w0();
        }
        return this.f504U1;
    }

    @Override // y2.AbstractC6519f, y2.e0
    public final void b(int i10, Object obj) {
        p2.S s10;
        boolean z10;
        AbstractC0075t abstractC0075t = this.N1;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 6) {
                    switch (i10) {
                        case 9:
                            obj.getClass();
                            S s11 = (S) abstractC0075t;
                            s11.f438E = ((Boolean) obj).booleanValue();
                            if (s11.u()) {
                                s10 = p2.S.f41931i0;
                            } else {
                                s10 = s11.f437D;
                            }
                            L l10 = new L(s10, -9223372036854775807L, -9223372036854775807L);
                            if (s11.n()) {
                                s11.f435B = l10;
                                return;
                            } else {
                                s11.f436C = l10;
                                return;
                            }
                        case 10:
                            obj.getClass();
                            int intValue = ((Integer) obj).intValue();
                            S s12 = (S) abstractC0075t;
                            if (s12.f455Z != intValue) {
                                s12.f455Z = intValue;
                                if (intValue != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                s12.f454Y = z10;
                                s12.e();
                                return;
                            }
                            return;
                        case 11:
                            this.f507X1 = (C6505H) obj;
                            return;
                        case 12:
                            if (AbstractC5530A.f45131a >= 23) {
                                U.a(abstractC0075t, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                C5053f c5053f = (C5053f) obj;
                c5053f.getClass();
                S s13 = (S) abstractC0075t;
                if (!s13.f457a0.equals(c5053f)) {
                    if (s13.f487x != null) {
                        s13.f457a0.getClass();
                    }
                    s13.f457a0 = c5053f;
                    return;
                }
                return;
            }
            C5052e c5052e = (C5052e) obj;
            c5052e.getClass();
            S s14 = (S) abstractC0075t;
            if (!s14.f434A.equals(c5052e)) {
                s14.f434A = c5052e;
                if (!s14.f461c0) {
                    s14.e();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        S s15 = (S) abstractC0075t;
        if (s15.P != floatValue) {
            s15.P = floatValue;
            if (s15.n()) {
                if (AbstractC5530A.f45131a >= 21) {
                    s15.f487x.setVolume(s15.P);
                    return;
                }
                AudioTrack audioTrack = s15.f487x;
                float f6 = s15.P;
                audioTrack.setStereoVolume(f6, f6);
            }
        }
    }

    @Override // C2.q
    public final void b0() {
        ((S) this.N1).f446M = true;
    }

    @Override // y2.Q
    public final p2.S c() {
        return ((S) this.N1).f437D;
    }

    @Override // y2.Q
    public final void d(p2.S s10) {
        S s11 = (S) this.N1;
        s11.getClass();
        s11.f437D = new p2.S(AbstractC5530A.h(s10.f41934Y, 0.1f, 8.0f), AbstractC5530A.h(s10.f41935Z, 0.1f, 8.0f));
        if (s11.u()) {
            s11.t();
            return;
        }
        L l10 = new L(s10, -9223372036854775807L, -9223372036854775807L);
        if (s11.n()) {
            s11.f435B = l10;
        } else {
            s11.f436C = l10;
        }
    }

    @Override // C2.q
    public final boolean f0(long j6, long j10, C2.j jVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j11, boolean z10, boolean z11, C5065s c5065s) {
        int i13;
        byteBuffer.getClass();
        if (this.f503S1 != null && (i11 & 2) != 0) {
            jVar.getClass();
            jVar.releaseOutputBuffer(i10, false);
            return true;
        }
        AbstractC0075t abstractC0075t = this.N1;
        if (z10) {
            if (jVar != null) {
                jVar.releaseOutputBuffer(i10, false);
            }
            this.f2578G1.f50594f += i12;
            ((S) abstractC0075t).f446M = true;
            return true;
        }
        try {
            if (!((S) abstractC0075t).k(byteBuffer, j11, i12)) {
                return false;
            }
            if (jVar != null) {
                jVar.releaseOutputBuffer(i10, false);
            }
            this.f2578G1.f50593e += i12;
            return true;
        } catch (C0073q e10) {
            throw e(5001, this.f502R1, e10, e10.f584Z);
        } catch (C0074s e11) {
            if (this.f2614p1) {
                j0 j0Var = this.f50566i0;
                j0Var.getClass();
                if (j0Var.f50643a != 0) {
                    i13 = 5003;
                    throw e(i13, c5065s, e11, e11.f586Z);
                }
            }
            i13 = 5002;
            throw e(i13, c5065s, e11, e11.f586Z);
        }
    }

    @Override // y2.AbstractC6519f
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // C2.q
    public final void i0() {
        int i10;
        try {
            S s10 = (S) this.N1;
            if (!s10.f451V && s10.n() && s10.d()) {
                s10.q();
                s10.f451V = true;
            }
        } catch (C0074s e10) {
            if (this.f2614p1) {
                i10 = 5003;
            } else {
                i10 = 5002;
            }
            throw e(i10, e10.f587h0, e10, e10.f586Z);
        }
    }

    @Override // y2.AbstractC6519f
    public final boolean k() {
        if (this.f2570C1) {
            S s10 = (S) this.N1;
            if (!s10.n() || (s10.f451V && !s10.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // C2.q, y2.AbstractC6519f
    public final boolean l() {
        if (!((S) this.N1).l() && !super.l()) {
            return false;
        }
        return true;
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void m() {
        U3.l lVar = this.f498M1;
        this.f506W1 = true;
        this.f502R1 = null;
        try {
            ((S) this.N1).e();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.m();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [y2.g, java.lang.Object] */
    @Override // y2.AbstractC6519f
    public final void n(boolean z10, boolean z11) {
        ?? obj = new Object();
        this.f2578G1 = obj;
        U3.l lVar = this.f498M1;
        Handler handler = (Handler) lVar.f17423Z;
        boolean z12 = false;
        if (handler != null) {
            handler.post(new RunnableC0065i(lVar, obj, 0));
        }
        j0 j0Var = this.f50566i0;
        j0Var.getClass();
        boolean z13 = j0Var.f50644b;
        AbstractC0075t abstractC0075t = this.N1;
        if (z13) {
            S s10 = (S) abstractC0075t;
            s10.getClass();
            if (AbstractC5530A.f45131a >= 21) {
                z12 = true;
            }
            Gi.e.n(z12);
            Gi.e.n(s10.f454Y);
            if (!s10.f461c0) {
                s10.f461c0 = true;
                s10.e();
            }
        } else {
            S s11 = (S) abstractC0075t;
            if (s11.f461c0) {
                s11.f461c0 = false;
                s11.e();
            }
        }
        C6755D c6755d = this.f50568k0;
        c6755d.getClass();
        S s12 = (S) abstractC0075t;
        s12.f482s = c6755d;
        AbstractC5532b abstractC5532b = this.f50569l0;
        abstractC5532b.getClass();
        s12.f472i.f608J = abstractC5532b;
    }

    @Override // C2.q, y2.AbstractC6519f
    public final void o(long j6, boolean z10) {
        super.o(j6, z10);
        ((S) this.N1).e();
        this.f504U1 = j6;
        this.f505V1 = true;
    }

    @Override // C2.q
    public final boolean o0(C5065s c5065s) {
        j0 j0Var = this.f50566i0;
        j0Var.getClass();
        if (j0Var.f50643a != 0) {
            int t02 = t0(c5065s);
            if ((t02 & 512) != 0) {
                j0 j0Var2 = this.f50566i0;
                j0Var2.getClass();
                if (j0Var2.f50643a == 2 || (t02 & 1024) != 0 || (c5065s.f42300G0 == 0 && c5065s.f42301H0 == 0)) {
                    return true;
                }
            }
        }
        if (((S) this.N1).h(c5065s) != 0) {
            return true;
        }
        return false;
    }

    @Override // y2.AbstractC6519f
    public final void p() {
        C6503F c6503f;
        C0062f c0062f = ((S) this.N1).f489z;
        if (c0062f != null && c0062f.f550h) {
            c0062f.f549g = null;
            int i10 = AbstractC5530A.f45131a;
            Context context = c0062f.f543a;
            if (i10 >= 23 && (c6503f = c0062f.f546d) != null) {
                AbstractC0060d.b(context, c6503f);
            }
            C4507D c4507d = c0062f.f547e;
            if (c4507d != null) {
                context.unregisterReceiver(c4507d);
            }
            C0061e c0061e = c0062f.f548f;
            if (c0061e != null) {
                c0061e.f540a.unregisterContentObserver(c0061e);
            }
            c0062f.f550h = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    @Override // C2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p0(C2.s sVar, C5065s c5065s) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        p2.r rVar;
        boolean z12;
        int i12;
        C2.m mVar;
        int i13 = 0;
        if (!MediaStreamTrack.AUDIO_TRACK_KIND.equals(p2.N.e(c5065s.f42319q0))) {
            return AbstractC6463a.a(0, 0, 0, 0);
        }
        if (AbstractC5530A.f45131a >= 21) {
            i10 = 32;
        } else {
            i10 = 0;
        }
        boolean z13 = true;
        int i14 = c5065s.f42306M0;
        if (i14 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i14 != 0 && i14 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i15 = 8;
        int i16 = 4;
        AbstractC0075t abstractC0075t = this.N1;
        if (z11) {
            if (z10) {
                List e10 = C2.y.e("audio/raw", false, false);
                if (e10.isEmpty()) {
                    mVar = null;
                } else {
                    mVar = (C2.m) e10.get(0);
                }
            }
            i11 = t0(c5065s);
            if (((S) abstractC0075t).h(c5065s) != 0) {
                return AbstractC6463a.a(4, 8, i10, i11);
            }
            if (!"audio/raw".equals(c5065s.f42319q0) && ((S) abstractC0075t).h(c5065s) == 0) {
                return AbstractC6463a.a(1, 0, 0, 0);
            }
            rVar = new p2.r();
            rVar.f42237k = "audio/raw";
            rVar.f42250x = c5065s.f42297D0;
            rVar.f42251y = c5065s.f42298E0;
            rVar.f42252z = 2;
            if (((S) abstractC0075t).h(new C5065s(rVar)) == 0) {
                k0 v02 = v0(sVar, c5065s, false, abstractC0075t);
                if (v02.isEmpty()) {
                    return AbstractC6463a.a(1, 0, 0, 0);
                }
                if (!z11) {
                    return AbstractC6463a.a(2, 0, 0, 0);
                }
                C2.m mVar2 = (C2.m) v02.get(0);
                boolean d10 = mVar2.d(c5065s);
                if (!d10) {
                    for (int i17 = 1; i17 < v02.f49575i0; i17++) {
                        C2.m mVar3 = (C2.m) v02.get(i17);
                        if (mVar3.d(c5065s)) {
                            z12 = false;
                            mVar2 = mVar3;
                            break;
                        }
                    }
                }
                z12 = true;
                z13 = d10;
                if (!z13) {
                    i16 = 3;
                }
                if (z13 && mVar2.e(c5065s)) {
                    i15 = 16;
                }
                if (mVar2.f2553g) {
                    i12 = 64;
                } else {
                    i12 = 0;
                }
                if (z12) {
                    i13 = 128;
                }
                return i16 | i15 | i10 | i12 | i13 | i11;
            }
            return AbstractC6463a.a(1, 0, 0, 0);
        }
        i11 = 0;
        if (!"audio/raw".equals(c5065s.f42319q0)) {
        }
        rVar = new p2.r();
        rVar.f42237k = "audio/raw";
        rVar.f42250x = c5065s.f42297D0;
        rVar.f42251y = c5065s.f42298E0;
        rVar.f42252z = 2;
        if (((S) abstractC0075t).h(new C5065s(rVar)) == 0) {
        }
    }

    @Override // y2.AbstractC6519f
    public final void q() {
        AbstractC0075t abstractC0075t = this.N1;
        try {
            E();
            h0();
            B2.k kVar = this.f2585K0;
            if (kVar != null) {
                kVar.c(null);
            }
            this.f2585K0 = null;
        } finally {
            if (this.f506W1) {
                this.f506W1 = false;
                ((S) abstractC0075t).s();
            }
        }
    }

    @Override // y2.AbstractC6519f
    public final void r() {
        ((S) this.N1).p();
    }

    @Override // y2.AbstractC6519f
    public final void s() {
        w0();
        S s10 = (S) this.N1;
        s10.f453X = false;
        if (s10.n()) {
            C0078w c0078w = s10.f472i;
            c0078w.d();
            if (c0078w.f633y == -9223372036854775807L) {
                C0077v c0077v = c0078w.f614f;
                c0077v.getClass();
                c0077v.a();
            } else {
                c0078w.f599A = c0078w.b();
                if (!S.o(s10.f487x)) {
                    return;
                }
            }
            s10.f487x.pause();
        }
    }

    public final int t0(C5065s c5065s) {
        int i10;
        C0064h g10 = ((S) this.N1).g(c5065s);
        if (!g10.f555a) {
            return 0;
        }
        if (g10.f556b) {
            i10 = 1536;
        } else {
            i10 = 512;
        }
        if (g10.f557c) {
            return i10 | 2048;
        }
        return i10;
    }

    public final int u0(C5065s c5065s, C2.m mVar) {
        int i10;
        if ("OMX.google.raw.decoder".equals(mVar.f2547a) && (i10 = AbstractC5530A.f45131a) < 24 && (i10 != 23 || !AbstractC5530A.B(this.f497L1))) {
            return -1;
        }
        return c5065s.f42320r0;
    }

    public final void w0() {
        long j6;
        ArrayDeque arrayDeque;
        long j10;
        boolean k10 = k();
        S s10 = (S) this.N1;
        if (s10.n() && !s10.f447N) {
            long min = Math.min(s10.f472i.a(k10), AbstractC5530A.G(s10.f485v.f408e, s10.j()));
            while (true) {
                arrayDeque = s10.f473j;
                if (arrayDeque.isEmpty() || min < ((L) arrayDeque.getFirst()).f421c) {
                    break;
                }
                s10.f436C = (L) arrayDeque.remove();
            }
            L l10 = s10.f436C;
            long j11 = min - l10.f421c;
            boolean equals = l10.f419a.equals(p2.S.f41931i0);
            q2.e eVar = s10.f458b;
            if (equals) {
                j10 = s10.f436C.f420b + j11;
            } else if (arrayDeque.isEmpty()) {
                j10 = eVar.a(j11) + s10.f436C.f420b;
            } else {
                L l11 = (L) arrayDeque.getFirst();
                j10 = l11.f420b - AbstractC5530A.s(s10.f436C.f419a.f41934Y, l11.f421c - min);
            }
            j6 = AbstractC5530A.G(s10.f485v.f408e, eVar.d()) + j10;
        } else {
            j6 = Long.MIN_VALUE;
        }
        if (j6 != Long.MIN_VALUE) {
            if (!this.f505V1) {
                j6 = Math.max(this.f504U1, j6);
            }
            this.f504U1 = j6;
            this.f505V1 = false;
        }
    }

    @Override // y2.AbstractC6519f
    public final y2.Q h() {
        return this;
    }
}
