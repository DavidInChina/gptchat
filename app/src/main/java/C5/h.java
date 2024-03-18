package c5;

import Cb.C0295e;
import Cb.C0297g;
import Cb.C0298h;
import Cb.C0310u;
import U3.l;
import Z8.AbstractC1809m0;
import Z8.l1;
import android.webkit.JavascriptInterface;
import b5.C2126a;
import b5.C2127b;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import eh.C2917q;
import f5.C2937a;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kf.w;
import nf.AbstractC4825e;
import org.json.JSONException;
import org.json.JSONObject;
import wd.s0;
import wd.u0;
import x8.W;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2294f f26276a;

    public h(C2294f c2294f) {
        this.f26276a = c2294f;
    }

    public static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            C2937a.c("ChallengeFragment", e10.getMessage(), new Throwable[0]);
            return null;
        }
    }

    @JavascriptInterface
    public void onCompleted(String str) {
        JSONObject a5 = a(str);
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Complete : " + a5.toString(), new Throwable[0]);
        if (c2294f.f18235l1 != null && c2294f.s()) {
            c2294f.O(false, false);
        }
        C2126a c2126a = c2294f.f26260F1;
        c2126a.getClass();
        C2937a.d("ArkoseChallenge", "ChallengeFragment.onComplete", new Throwable[0]);
        C2127b c2127b = c2126a.f25633Y;
        i a10 = i.a(c2127b.f25635Y);
        if (a10 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a10.f26278a;
            if (i10 < arrayList.size()) {
                AbstractC4825e abstractC4825e = ((C0297g) arrayList.get(i10)).f2940a;
                AbstractC1809m0.a().b(l1.f23369d, w.f37484Y);
                try {
                    C2917q c2917q = md.b.f39132a;
                    String jSONObject = a5.toString();
                    AbstractC3557B.b0("toString(...)", jSONObject);
                    c2917q.getClass();
                    abstractC4825e.resumeWith(new u0((C0310u) c2917q.b(C0310u.Companion.serializer(), jSONObject)));
                } catch (Exception e10) {
                    W.W(Pc.e.a(), "Received unexpected Arkose success", e10, null, 4);
                    abstractC4825e.resumeWith(new s0(2, e10));
                }
                i10++;
            } else {
                i.b(c2127b.f25635Y);
                return;
            }
        }
    }

    @JavascriptInterface
    public void onDataRequest(String str) {
        l lVar = new l(a(str), 11, null);
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        C2937a.d("ChallengeFragment", "Data", new Throwable[0]);
        if (c2294f.d() != null) {
            c2294f.d().runOnUiThread(new RunnableC2295g(c2294f, lVar, 1));
        }
    }

    @JavascriptInterface
    public void onError(String str) {
        this.f26276a.R(new l(a(str), 11, null));
    }

    @JavascriptInterface
    public void onFailed(String str) {
        JSONObject a5 = a(str);
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Failed : " + a5.toString(), new Throwable[0]);
        if (c2294f.s()) {
            c2294f.O(false, false);
        }
        i a10 = i.a(c2294f.f26260F1.f25633Y.f25635Y);
        if (a10 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a10.f26279b;
            if (i10 < arrayList.size()) {
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() != null) {
                    AbstractC4825e abstractC4825e = ((C0298h) weakReference.get()).f2948a;
                    AbstractC1809m0.a().b(l1.f23367b, w.f37484Y);
                    try {
                        C2917q c2917q = md.b.f39132a;
                        String jSONObject = a5.toString();
                        AbstractC3557B.b0("toString(...)", jSONObject);
                        c2917q.getClass();
                        abstractC4825e.resumeWith(new u0((C0310u) c2917q.b(C0310u.Companion.serializer(), jSONObject)));
                    } catch (Exception e10) {
                        W.W(Pc.e.a(), "Received unexpected Arkose failure", e10, null, 4);
                        abstractC4825e.resumeWith(new s0(2, e10));
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @JavascriptInterface
    public void onHide() {
        this.f26276a.V();
    }

    @JavascriptInterface
    public void onReady() {
        C2294f c2294f = this.f26276a;
        c2294f.f26257C1 = true;
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Ready", new Throwable[0]);
        C2126a c2126a = c2294f.f26260F1;
        c2126a.getClass();
        C2937a.d("ArkoseChallenge", "ChallengeFragment.onReady", new Throwable[0]);
        i a5 = i.a(c2126a.f25633Y.f25635Y);
        if (a5 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a5.f26283f;
            if (i10 < arrayList.size()) {
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @JavascriptInterface
    public void onReset() {
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Reset", new Throwable[0]);
        i a5 = i.a(c2294f.f26260F1.f25633Y.f25635Y);
        if (a5 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a5.f26286i;
            if (i10 < arrayList.size()) {
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @JavascriptInterface
    public void onResize(String str) {
        l lVar = new l(a(str), 11, null);
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        C2937a.d("ChallengeFragment", "Resize : " + ((JSONObject) lVar.f17423Z).toString(), new Throwable[0]);
        C2126a c2126a = c2294f.f26260F1;
        c2126a.getClass();
        C2937a.d("ArkoseChallenge", "ChallengeFragment.onResize", new Throwable[0]);
        i a5 = i.a(c2126a.f25633Y.f25635Y);
        if (a5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = a5.f26281d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            }
        }
        if (c2294f.d() != null) {
            c2294f.d().runOnUiThread(new RunnableC2295g(c2294f, lVar, 0));
        }
    }

    @JavascriptInterface
    public void onShow() {
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Show", new Throwable[0]);
        C2126a c2126a = c2294f.f26260F1;
        c2126a.getClass();
        C2937a.d("ArkoseChallenge", "ChallengeFragment.onShow", new Throwable[0]);
        i a5 = i.a(c2126a.f25633Y.f25635Y);
        if (a5 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a5.f26284g;
            if (i10 < arrayList.size()) {
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() != null) {
                    ((C0295e) weakReference.get()).getClass();
                    AbstractC1809m0.a().b(l1.f23368c, w.f37484Y);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @JavascriptInterface
    public void onShown() {
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Shown", new Throwable[0]);
        C2126a c2126a = c2294f.f26260F1;
        c2126a.getClass();
        C2937a.d("ArkoseChallenge", "ChallengeFragment.onShown", new Throwable[0]);
        i a5 = i.a(c2126a.f25633Y.f25635Y);
        if (a5 != null) {
            while (true) {
                ArrayList arrayList = a5.f26285h;
                if (i10 >= arrayList.size()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            }
        }
        if (c2294f.d() != null) {
            c2294f.d().runOnUiThread(new RunnableC2290b(1, c2294f));
        }
    }

    @JavascriptInterface
    public void onSuppress() {
        C2294f c2294f = this.f26276a;
        c2294f.getClass();
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Suppress", new Throwable[0]);
        i a5 = i.a(c2294f.f26260F1.f25633Y.f25635Y);
        if (a5 != null) {
            while (true) {
                ArrayList arrayList = a5.f26287j;
                if (i10 >= arrayList.size()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            }
        }
        if (c2294f.d() != null) {
            c2294f.d().runOnUiThread(new RunnableC2290b(2, c2294f));
        }
    }
}
