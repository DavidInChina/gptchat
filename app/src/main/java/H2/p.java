package H2;

import B2.E;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import livekit.org.webrtc.MediaStreamTrack;
import p2.C5052e;
import p2.C5065s;
import p2.h0;
import p2.k0;
import s2.AbstractC5530A;
import v.C5934c;
import x8.B;
import x8.N;
import x8.j0;
import y2.C6510M;
import y2.i0;

/* loaded from: classes2.dex */
public final class p extends v implements i0 {

    /* renamed from: i  reason: collision with root package name */
    public static final j0 f7318i;

    /* renamed from: j  reason: collision with root package name */
    public static final j0 f7319j;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7320c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final r f7321d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7322e;

    /* renamed from: f  reason: collision with root package name */
    public final i f7323f;

    /* renamed from: g  reason: collision with root package name */
    public final E f7324g;

    /* renamed from: h  reason: collision with root package name */
    public C5052e f7325h;

    static {
        j0 j0Var;
        j0 j0Var2;
        C5934c c5934c = new C5934c(7);
        if (c5934c instanceof j0) {
            j0Var = (j0) c5934c;
        } else {
            j0Var = new B(c5934c);
        }
        f7318i = j0Var;
        C5934c c5934c2 = new C5934c(8);
        if (c5934c2 instanceof j0) {
            j0Var2 = (j0) c5934c2;
        } else {
            j0Var2 = new B(c5934c2);
        }
        f7319j = j0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, H2.r] */
    public p(Context context) {
        boolean z10;
        E e10;
        Spatializer spatializer;
        ?? obj = new Object();
        String str = i.f7249B1;
        i iVar = new i(new h(context));
        if (context != null) {
            context.getApplicationContext();
        }
        this.f7321d = obj;
        this.f7323f = iVar;
        this.f7325h = C5052e.f42005l0;
        if (context != null && AbstractC5530A.B(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7322e = z10;
        if (!z10 && context != null && AbstractC5530A.f45131a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                e10 = new E(spatializer);
            } else {
                e10 = null;
            }
            this.f7324g = e10;
        }
        if (iVar.f7278u1 && context == null) {
            s2.p.g("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int b(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = '\uffff';
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void d(E2.i0 i0Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < i0Var.f4361Y; i10++) {
            p2.i0 i0Var2 = (p2.i0) iVar.f42166E0.get(i0Var.b(i10));
            if (i0Var2 != null) {
                h0 h0Var = i0Var2.f42079Y;
                p2.i0 i0Var3 = (p2.i0) hashMap.get(Integer.valueOf(h0Var.f42074h0));
                if (i0Var3 == null || (i0Var3.f42080Z.isEmpty() && !i0Var2.f42080Z.isEmpty())) {
                    hashMap.put(Integer.valueOf(h0Var.f42074h0), i0Var2);
                }
            }
        }
    }

    public static int e(C5065s c5065s, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c5065s.f42310h0)) {
            return 4;
        }
        String h10 = h(str);
        String h11 = h(c5065s.f42310h0);
        if (h11 != null && h10 != null) {
            if (!h11.startsWith(h10) && !h10.startsWith(h11)) {
                int i10 = AbstractC5530A.f45131a;
                if (!h11.split("-", 2)[0].equals(h10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || h11 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4 && (!z10 || i11 != 3)) {
            return false;
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean j(i iVar, int i10, C5065s c5065s) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        k0 k0Var = iVar.f42186x0;
        if (k0Var.f42095h0 && (i10 & 2048) == 0) {
            return false;
        }
        if (!k0Var.f42094Z) {
            return true;
        }
        if (c5065s.f42300G0 == 0 && c5065s.f42301H0 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i10 & 1024) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !z11) {
            return false;
        }
        return true;
    }

    public static Pair k(int i10, u uVar, int[][][] iArr, m mVar, C5934c c5934c) {
        Object obj;
        boolean z10;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < uVar2.f7329a) {
            if (i10 == uVar2.f7330b[i11]) {
                E2.i0 i0Var = uVar2.f7331c[i11];
                for (int i12 = 0; i12 < i0Var.f4361Y; i12++) {
                    h0 b10 = i0Var.b(i12);
                    x8.k0 a5 = mVar.a(i11, b10, iArr[i11][i12]);
                    int i13 = b10.f42072Y;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        n nVar = (n) a5.get(i14);
                        int a10 = nVar.a();
                        if (!zArr[i14] && a10 != 0) {
                            if (a10 == 1) {
                                obj = N.u0(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    n nVar2 = (n) a5.get(i15);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z10 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                    }
                }
            }
            i11++;
            uVar2 = uVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, c5934c);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((n) list.get(i16)).f7302h0;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f7301Z, iArr2), Integer.valueOf(nVar3.f7300Y));
    }

    @Override // H2.v
    public final void a() {
        E e10;
        synchronized (this.f7320c) {
            if (AbstractC5530A.f45131a >= 32 && (e10 = this.f7324g) != null) {
                Object obj = e10.f1741d;
                if (((Spatializer$OnSpatializerStateChangedListener) obj) != null && ((Handler) e10.f1740c) != null) {
                    ((Spatializer) e10.f1739b).removeOnSpatializerStateChangedListener((Spatializer$OnSpatializerStateChangedListener) obj);
                    ((Handler) e10.f1740c).removeCallbacksAndMessages(null);
                    e10.f1740c = null;
                    e10.f1741d = null;
                }
            }
        }
        this.f7335a = null;
        this.f7336b = null;
    }

    public final void g() {
        boolean z10;
        C6510M c6510m;
        E e10;
        synchronized (this.f7320c) {
            try {
                if (this.f7323f.f7278u1 && !this.f7322e && AbstractC5530A.f45131a >= 32 && (e10 = this.f7324g) != null && e10.f1738a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (c6510m = this.f7335a) != null) {
            c6510m.f50437m0.d(10);
        }
    }

    public final void i() {
        boolean z10;
        C6510M c6510m;
        synchronized (this.f7320c) {
            z10 = this.f7323f.f7282y1;
        }
        if (z10 && (c6510m = this.f7335a) != null) {
            c6510m.f50437m0.d(26);
        }
    }
}
