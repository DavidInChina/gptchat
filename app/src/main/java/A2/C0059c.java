package A2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p2.C5065s;
import s2.AbstractC5530A;
import x8.k0;
import x8.p0;
import z8.C6779a;

/* renamed from: A2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0059c f535c = new C0059c(new int[]{2}, 10);

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f536d;

    /* renamed from: e  reason: collision with root package name */
    public static final p0 f537e;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f538a;

    /* renamed from: b  reason: collision with root package name */
    public final int f539b;

    static {
        Object[] objArr = {2, 5, 6};
        P4.a.s(3, objArr);
        f536d = x8.N.T(3, objArr);
        O4.a aVar = new O4.a(4);
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        f537e = aVar.a();
    }

    public C0059c(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f538a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f538a = new int[0];
        }
        this.f539b = i10;
    }

    public static boolean a() {
        if (AbstractC5530A.f45131a >= 17) {
            String str = AbstractC5530A.f45133c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C0059c b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [x8.Q, x8.H] */
    public static C0059c c(Context context, Intent intent) {
        List list;
        int i10 = AbstractC5530A.f45131a;
        C0059c c0059c = f535c;
        if (i10 >= 23 && AbstractC0057a.b(context)) {
            return c0059c;
        }
        ?? h10 = new x8.H();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            k0 k0Var = f536d;
            k0Var.getClass();
            h10.f0(k0Var);
        }
        if (i10 >= 29 && (AbstractC5530A.B(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            x8.N a5 = AbstractC0058b.a();
            a5.getClass();
            h10.f0(a5);
            return new C0059c(M3.H.y0(h10.j0()), 10);
        } else if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                if (intArrayExtra.length == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new C6779a(0, intArrayExtra.length, intArrayExtra);
                }
                list.getClass();
                h10.f0(list);
            }
            return new C0059c(M3.H.y0(h10.j0()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        } else {
            x8.S j02 = h10.j0();
            if (!j02.isEmpty()) {
                return new C0059c(M3.H.y0(j02), 10);
            }
            return c0059c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
        if (r8 != 5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(C5065s c5065s) {
        int p10;
        int intValue;
        String str = c5065s.f42319q0;
        str.getClass();
        int b10 = p2.N.b(str, c5065s.f42316n0);
        Integer valueOf = Integer.valueOf(b10);
        p0 p0Var = f537e;
        if (!p0Var.containsKey(valueOf)) {
            return null;
        }
        int[] iArr = this.f538a;
        int i10 = 6;
        if (b10 == 18 && Arrays.binarySearch(iArr, 18) < 0) {
            b10 = 6;
        } else if ((b10 == 8 && Arrays.binarySearch(iArr, 8) < 0) || (b10 == 30 && Arrays.binarySearch(iArr, 30) < 0)) {
            b10 = 7;
        }
        if (Arrays.binarySearch(iArr, b10) < 0) {
            return null;
        }
        int i11 = c5065s.f42297D0;
        if (i11 != -1 && b10 != 18) {
            if (c5065s.f42319q0.equals("audio/vnd.dts.uhd;profile=p2")) {
                if (i11 > 10) {
                    return null;
                }
            } else if (i11 > this.f539b) {
                return null;
            }
        } else {
            int i12 = c5065s.f42298E0;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (AbstractC5530A.f45131a >= 29) {
                intValue = AbstractC0058b.b(b10, i12);
            } else {
                Integer num = 0;
                Object obj = p0Var.get(Integer.valueOf(b10));
                if (obj != null) {
                    num = obj;
                }
                intValue = num.intValue();
            }
            i11 = intValue;
        }
        int i13 = AbstractC5530A.f45131a;
        if (i13 <= 28) {
            if (i11 == 7) {
                i10 = 8;
            } else if (i11 != 3) {
                if (i11 != 4) {
                }
            }
            if (i13 <= 26 && "fugu".equals(AbstractC5530A.f45132b) && i10 == 1) {
                i10 = 2;
            }
            p10 = AbstractC5530A.p(i10);
            if (p10 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(b10), Integer.valueOf(p10));
        }
        i10 = i11;
        if (i13 <= 26) {
            i10 = 2;
        }
        p10 = AbstractC5530A.p(i10);
        if (p10 != 0) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0059c)) {
            return false;
        }
        C0059c c0059c = (C0059c) obj;
        if (Arrays.equals(this.f538a, c0059c.f538a) && this.f539b == c0059c.f539b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f538a) * 31) + this.f539b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f539b + ", supportedEncodings=" + Arrays.toString(this.f538a) + "]";
    }
}
