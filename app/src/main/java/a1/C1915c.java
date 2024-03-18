package a1;

import C2.w;
import Y1.e;
import Y1.g;
import Z1.C1765h0;
import Z1.j0;
import Z1.p0;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.SparseIntArray;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import androidx.glance.appwidget.protobuf.AbstractC2065z;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.M;
import androidx.lifecycle.S;
import b2.C2110e;
import b2.C2112g;
import com.google.android.gms.internal.play_billing.N;
import e2.C2770b;
import e2.C2771c;
import h2.C3309f;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import yf.AbstractC6583a;

/* renamed from: a1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1915c implements w {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23847Y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1915c() {
        this(27);
        this.f23847Y = 27;
    }

    public static final float b(float f6, float[] fArr, float[] fArr2) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10 = C1916d.f23848c;
        float abs = Math.abs(f6);
        float signum = Math.signum(f6);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            f10 = signum * fArr2[binarySearch];
        } else {
            int i11 = -(binarySearch + 1);
            int i12 = i11 - 1;
            if (i12 >= fArr.length - 1) {
                float f16 = fArr[fArr.length - 1];
                float f17 = fArr2[fArr.length - 1];
                if (f16 == 0.0f) {
                    return 0.0f;
                }
                return (f17 / f16) * f6;
            }
            if (i12 == -1) {
                float f18 = fArr[0];
                f13 = fArr2[0];
                f11 = f18;
                f12 = 0.0f;
                f14 = 0.0f;
            } else {
                float f19 = fArr[i12];
                float f20 = fArr[i11];
                f14 = fArr2[i12];
                f12 = f19;
                f13 = fArr2[i11];
                f11 = f20;
            }
            if (f12 == f11) {
                f15 = 0.0f;
            } else {
                f15 = (abs - f12) / (f11 - f12);
            }
            f10 = signum * (((f13 - f14) * Math.max(0.0f, Math.min(1.0f, f15))) + f14);
        }
        return f10;
    }

    public static Intent h(Context context, Class cls, int i10, e eVar) {
        Intent putExtra = new Intent(context, ActionCallbackBroadcastReceiver.class).setPackage(context.getPackageName()).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i10);
        Map unmodifiableMap = Collections.unmodifiableMap(((g) eVar).f22053a);
        ArrayList arrayList = new ArrayList(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            arrayList.add(new C3959i(((Y1.c) entry.getKey()).f22050a, entry.getValue()));
        }
        C3959i[] c3959iArr = (C3959i[]) arrayList.toArray(new C3959i[0]);
        putExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", R4.b.L((C3959i[]) Arrays.copyOf(c3959iArr, c3959iArr.length)));
        return putExtra;
    }

    public static void i(Activity activity, EnumC2081p enumC2081p) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("event", enumC2081p);
        if (activity instanceof AbstractC2086v) {
            S h10 = ((AbstractC2086v) activity).h();
            if (h10 instanceof C2088x) {
                ((C2088x) h10).k(enumC2081p);
            }
        }
    }

    public static void j() {
        C1915c c1915c = C2770b.f28744b;
    }

    public static void p(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            M.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new M());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // C2.w
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // C2.w
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // C2.w
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // C2.w
    public final int e() {
        return MediaCodecList.getCodecCount();
    }

    @Override // C2.w
    public final boolean f() {
        return false;
    }

    public final int k() {
        switch (this.f23847Y) {
            case 18:
                return C2771c.f28749f;
            default:
                C1915c c1915c = C2770b.f28744b;
                return 1;
        }
    }

    public SparseIntArray[] m() {
        return null;
    }

    public final int n() {
        switch (this.f23847Y) {
            case 18:
                return C2771c.f28748e;
            default:
                C1915c c1915c = C2770b.f28744b;
                return 0;
        }
    }

    public boolean q(Spannable spannable) {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:2|(2:4|(13:6|8|34|(1:(2:11|12)(2:15|16))(3:17|18|(1:20))|21|22|25|(1:27)|28|(2:31|29)|36|32|33))|7|8|34|(0)(0)|21|22|25|(0)|28|(1:29)|36|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        io.sentry.android.core.AbstractC3612c.d("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r9, r10);
        r10 = b2.C2110e.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        io.sentry.android.core.AbstractC3612c.d("GlanceAppWidget", "Set of layout structures for App Widget id " + r9 + " is corrupted", r10);
        r10 = b2.C2110e.q();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[LOOP:0: B:29:0x00ad->B:31:0x00b3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Context context, int i10, AbstractC4825e abstractC4825e) {
        C1765h0 c1765h0;
        int i11;
        int n02;
        if (abstractC4825e instanceof C1765h0) {
            c1765h0 = (C1765h0) abstractC4825e;
            int i12 = c1765h0.f22974j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c1765h0.f22974j0 = i12 - Integer.MIN_VALUE;
                Object obj = c1765h0.f22972h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c1765h0.f22974j0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i10 = c1765h0.f22971Z;
                        context = c1765h0.f22970Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    c1765h0.f22970Y = context;
                    c1765h0.f22971Z = i10;
                    c1765h0.f22974j0 = 1;
                    obj = C3309f.f31773a.c(context, p0.f23050a, "appWidgetLayout-" + i10, c1765h0);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                C2110e c2110e = (C2110e) obj;
                Context context2 = context;
                int i13 = i10;
                AbstractC2065z<C2112g> r10 = c2110e.r();
                n02 = P4.a.n0(AbstractC6583a.H1(r10, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
                for (C2112g c2112g : r10) {
                    linkedHashMap.put(c2112g.p(), new Integer(c2112g.q()));
                }
                LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap);
                return new j0(context2, m12, c2110e.s(), i13, t.O2(m12.values()));
            }
        }
        c1765h0 = new C1765h0(this, abstractC4825e);
        Object obj2 = c1765h0.f22972h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c1765h0.f22974j0;
        if (i11 == 0) {
        }
        C2110e c2110e2 = (C2110e) obj2;
        Context context22 = context;
        int i132 = i10;
        AbstractC2065z<C2112g> r102 = c2110e2.r();
        n02 = P4.a.n0(AbstractC6583a.H1(r102, 10));
        if (n02 < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n02);
        while (r8.hasNext()) {
        }
        LinkedHashMap m122 = AbstractC4268D.m1(linkedHashMap2);
        return new j0(context22, m122, c2110e2.s(), i132, t.O2(m122.values()));
    }

    public SparseIntArray[] t(Activity activity) {
        return null;
    }

    public SparseIntArray[] u() {
        return null;
    }

    public SparseIntArray[] x() {
        return null;
    }

    public /* synthetic */ C1915c(int i10) {
        this.f23847Y = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1915c(int i10, int i11) {
        this(0);
        this.f23847Y = i10;
        if (i10 == 3) {
            this(3);
        } else if (i10 == 4) {
            this(4);
        } else if (i10 != 6) {
            switch (i10) {
                case 11:
                    this(11);
                    return;
                case 12:
                    this(12);
                    return;
                case 13:
                    this(13);
                    return;
                case 14:
                    this(14);
                    return;
                default:
                    switch (i10) {
                        case 18:
                            this(18);
                            return;
                        case 19:
                            this(19);
                            return;
                        case 20:
                            this(20);
                            return;
                        case 21:
                            this(21);
                            return;
                        case 22:
                            this(22);
                            return;
                        case 23:
                            this(23);
                            return;
                        case 24:
                            this(24);
                            return;
                        case 25:
                            this(25);
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this(6);
        }
    }

    public void o() {
    }

    public void w() {
    }

    public void g(Activity activity) {
    }

    public KeyListener l(KeyListener keyListener) {
        return keyListener;
    }

    public void v(boolean z10) {
    }

    public InputConnection s(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }
}
