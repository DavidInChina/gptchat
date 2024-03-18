package c5;

import Cb.C0296f;
import Cb.C0305o;
import M3.H;
import U3.l;
import V1.DialogInterface$OnCancelListenerC1472m;
import V1.DialogInterface$OnCancelListenerC1475p;
import Z8.AbstractC1809m0;
import Z8.l1;
import android.app.Dialog;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b5.C2126a;
import b5.C2127b;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import e5.C2804a;
import eh.C2917q;
import f5.C2937a;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import kf.w;
import nf.AbstractC4825e;
import org.json.JSONException;
import org.json.JSONObject;
import wd.s0;
import x8.W;

/* renamed from: c5.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2294f extends DialogInterface$OnCancelListenerC1475p {

    /* renamed from: I1  reason: collision with root package name */
    public static final /* synthetic */ int f26254I1 = 0;

    /* renamed from: A1  reason: collision with root package name */
    public boolean f26255A1;

    /* renamed from: B1  reason: collision with root package name */
    public boolean f26256B1;

    /* renamed from: F1  reason: collision with root package name */
    public C2126a f26260F1;

    /* renamed from: G1  reason: collision with root package name */
    public GLSurfaceView f26261G1;

    /* renamed from: q1  reason: collision with root package name */
    public View f26263q1;

    /* renamed from: r1  reason: collision with root package name */
    public FrameLayout f26264r1;

    /* renamed from: s1  reason: collision with root package name */
    public LinearLayout f26265s1;

    /* renamed from: t1  reason: collision with root package name */
    public WebView f26266t1;

    /* renamed from: u1  reason: collision with root package name */
    public String f26267u1;

    /* renamed from: v1  reason: collision with root package name */
    public String f26268v1;

    /* renamed from: w1  reason: collision with root package name */
    public String f26269w1;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f26270x1;

    /* renamed from: y1  reason: collision with root package name */
    public String f26271y1;

    /* renamed from: z1  reason: collision with root package name */
    public String f26272z1;

    /* renamed from: C1  reason: collision with root package name */
    public boolean f26257C1 = false;

    /* renamed from: D1  reason: collision with root package name */
    public final Handler f26258D1 = new Handler(Looper.getMainLooper());

    /* renamed from: E1  reason: collision with root package name */
    public Integer f26259E1 = 0;

    /* renamed from: H1  reason: collision with root package name */
    public final C2289a f26262H1 = new C2289a(this);

    public static void S(C2294f c2294f) {
        c2294f.getClass();
        try {
            C2804a a5 = C2804a.a();
            Context m10 = c2294f.m();
            a5.getClass();
            String b10 = C2804a.b(m10);
            c2294f.m();
            H.f11528b.edit().clear().apply();
            String replace = b10.replace(Separators.DOUBLE_QUOTE, "\\\"").replace("\\", "");
            C2937a.d("ChallengeFragment", "Fingerprint Data: " + replace, new Throwable[0]);
            String encodeToString = Base64.encodeToString(replace.getBytes(), 2);
            C2937a.d("ChallengeFragment", "Encoded fingerprint data: " + encodeToString, new Throwable[0]);
            WebView webView = c2294f.f26266t1;
            webView.evaluateJavascript("javascript: fingerprintData(\"" + encodeToString + "\")", null);
        } catch (Exception unused) {
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void A() {
        this.f18267H0 = true;
        Integer num = this.f26259E1;
        int intValue = num.intValue();
        HashMap hashMap = C2127b.f25634Z;
        synchronized (C2127b.class) {
            if (intValue != 0) {
                HashMap hashMap2 = C2127b.f25634Z;
                if (hashMap2.containsKey(num)) {
                    hashMap2.remove(num);
                    hashMap2.size();
                }
            }
        }
        WebView webView = this.f26266t1;
        if (webView != null) {
            webView.removeJavascriptInterface("ARKOSE");
            ((ViewGroup) this.f26263q1).removeAllViews();
            this.f26266t1.destroy();
            this.f26266t1 = null;
        }
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void G() {
        super.G();
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            Window window = dialog.getWindow();
            i a5 = i.a(this.f26260F1.f25633Y.f25635Y);
            if (a5 != null) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = a5.f26282e;
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
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (!this.f26270x1) {
                window.clearFlags(2);
            }
            dialog.setCanceledOnTouchOutside(this.f26256B1);
            dialog.setOnCancelListener(new DialogInterface$OnCancelListenerC1472m(this, 1));
            dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC2291c(this));
        }
    }

    public final void Q() {
        C2937a.d("ChallengeFragment", "Creating view", new Throwable[0]);
        try {
            InputStream open = m().getAssets().open("ArkoseLabsAPI.html");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            String str = new String(bArr);
            String replace = str.replace("src=\"\"", "src=\"" + this.f26267u1 + Separators.SLASH + this.f26269w1 + Separators.DOUBLE_QUOTE);
            String str2 = this.f26271y1;
            if (str2 != null && !str2.isEmpty()) {
                replace = replace.replace("blob: \"\"", "blob: \"" + this.f26271y1 + Separators.DOUBLE_QUOTE);
            }
            String str3 = this.f26272z1;
            if (str3 != null && !str3.isEmpty()) {
                replace = replace.replace("language: ''", "language: '" + this.f26272z1 + Separators.QUOTE);
            }
            String str4 = this.f26268v1;
            if (str4 != null && !str4.isEmpty()) {
                U(replace.replace("publicKey: ''", "publicKey: '" + this.f26268v1 + Separators.QUOTE));
                return;
            }
            T("API_KEY cannot be a null or empty string");
        } catch (IOException e10) {
            C2937a.c("ChallengeFragment", e10.getMessage(), new Throwable[0]);
        }
    }

    public final void R(l lVar) {
        C2937a.c("ChallengeFragment", "Error : " + ((JSONObject) lVar.f17423Z).toString(), new Throwable[0]);
        if (s()) {
            O(false, false);
        }
        i a5 = i.a(this.f26260F1.f25633Y.f25635Y);
        if (a5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = a5.f26280c;
                if (i10 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i10);
                    if (weakReference.get() != null) {
                        AbstractC4825e abstractC4825e = ((C0296f) weakReference.get()).f2939a;
                        AbstractC1809m0.a().b(l1.f23367b, w.f37484Y);
                        try {
                            C2917q c2917q = md.b.f39132a;
                            String jSONObject = ((JSONObject) lVar.f17423Z).toString();
                            AbstractC3557B.b0("toString(...)", jSONObject);
                            c2917q.getClass();
                            abstractC4825e.resumeWith(new s0(0, ((C0305o) c2917q.b(C0305o.Companion.serializer(), jSONObject)).f2956a));
                        } catch (Exception e10) {
                            W.W(Pc.e.a(), "Received unexpected Arkose error", e10, null, 4);
                            abstractC4825e.resumeWith(new s0(2, e10));
                        }
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void T(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("error", str);
            R(new l(jSONObject, 11, null));
        } catch (JSONException e10) {
            C2937a.c("JSON Exception", e10.toString(), new Throwable[0]);
            e10.printStackTrace();
        }
    }

    public final void U(String str) {
        try {
            this.f26266t1.setBackgroundColor(0);
            this.f26266t1.getSettings().setLoadsImagesAutomatically(true);
            this.f26266t1.getSettings().setJavaScriptEnabled(true);
            this.f26266t1.getSettings().setLoadsImagesAutomatically(true);
            this.f26266t1.getSettings().setUseWideViewPort(true);
            this.f26266t1.setOverScrollMode(2);
            this.f26266t1.setWebChromeClient(new WebChromeClient());
            this.f26266t1.getSettings().setMediaPlaybackRequiresUserGesture(false);
            C2937a.c("ChallengeFragment", this.f26266t1.getSettings().getUserAgentString() + "", new Throwable[0]);
            this.f26266t1.getSettings().setUserAgentString(null);
            C2937a.c("ChallengeFragment", this.f26266t1.getSettings().getUserAgentString() + "", new Throwable[0]);
            this.f26266t1.addJavascriptInterface(new h(this), "ARKOSE");
            this.f26266t1.setWebViewClient(new C2292d(0, this));
            this.f26266t1.setDownloadListener(new C2293e(this));
            ConnectivityManager connectivityManager = (ConnectivityManager) d().getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() != null) {
                connectivityManager.getActiveNetworkInfo().isConnected();
            }
            this.f26266t1.loadDataWithBaseURL("file:///android_asset/", str, "text/html", "UTF-8", null);
        } catch (Exception e10) {
            C2937a.c("ChallengeFragment", e10.getMessage(), new Throwable[0]);
        }
    }

    public final void V() {
        int i10 = 0;
        C2937a.d("ChallengeFragment", "Hide", new Throwable[0]);
        Dialog dialog = this.f18235l1;
        if (dialog != null) {
            dialog.hide();
        }
        C2127b c2127b = this.f26260F1.f25633Y;
        i a5 = i.a(c2127b.f25635Y);
        if (a5 == null) {
            return;
        }
        while (true) {
            ArrayList arrayList = a5.f26288k;
            if (i10 < arrayList.size()) {
                WeakReference weakReference = (WeakReference) arrayList.get(i10);
                if (weakReference.get() == null) {
                    i10++;
                } else {
                    AbstractC2469q0.p(weakReference.get());
                    throw null;
                }
            } else {
                i.b(c2127b.f25635Y);
                return;
            }
        }
    }

    @Override // V1.DialogInterface$OnCancelListenerC1475p, V1.AbstractComponentCallbacksC1480v
    public final void y(Bundle bundle) {
        super.y(bundle);
        Bundle bundle2 = this.f18290k0;
        if (bundle2 != null) {
            try {
                b5.d dVar = (b5.d) bundle2.getSerializable("KEY_CONFIG");
                this.f26259E1 = (Integer) this.f18290k0.getSerializable("KEY_INSTANCE_ID");
                this.f26260F1 = (C2126a) this.f18290k0.getSerializable("KEY_LISTENER");
                dVar.getClass();
                this.f26269w1 = "api.js";
                this.f26270x1 = true;
                this.f26255A1 = true;
                this.f26256B1 = true;
                this.f26267u1 = dVar.f25640Y;
                this.f26268v1 = dVar.f25641Z;
                this.f26271y1 = dVar.f25642h0;
                this.f26272z1 = dVar.f25643i0;
                Integer num = this.f26259E1;
                int intValue = num.intValue();
                HashMap hashMap = C2127b.f25634Z;
                synchronized (C2127b.class) {
                    if (intValue != 0) {
                        C2127b.f25634Z.put(num, this);
                    }
                }
            } catch (Exception e10) {
                T(e10.getMessage());
            }
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        try {
            View inflate = layoutInflater.inflate(R.layout.activity_alsdk_webview, viewGroup, false);
            this.f26263q1 = inflate;
            this.f26264r1 = (FrameLayout) inflate.findViewById(R.id.alsdk_root_layout);
            LinearLayout linearLayout = (LinearLayout) this.f26263q1.findViewById(R.id.alsdk_loadingContainer);
            if (linearLayout != null) {
                if (this.f26270x1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                linearLayout.setVisibility(i10);
            } else {
                C2937a.c("ChallengeFragment", "Unable to find unique loadingContainer ID", new Throwable[0]);
            }
            LinearLayout linearLayout2 = (LinearLayout) this.f26263q1.findViewById(R.id.alsdk_webViewFrame);
            this.f26265s1 = linearLayout2;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
                this.f26265s1.setBackgroundColor(0);
            } else {
                C2937a.c("ChallengeFragment", "Unable to find unique webViewFrame ID", new Throwable[0]);
            }
            WebView webView = (WebView) this.f26263q1.findViewById(R.id.alsdk_webView);
            this.f26266t1 = webView;
            if (webView == null) {
                C2937a.c("ChallengeFragment", "Unable to find unique webView ID", new Throwable[0]);
            }
            GLSurfaceView gLSurfaceView = new GLSurfaceView(d());
            this.f26261G1 = gLSurfaceView;
            gLSurfaceView.setRenderer(this.f26262H1);
            this.f26264r1.addView(this.f26261G1);
            Q();
            return this.f26263q1;
        } catch (Exception e10) {
            C2937a.c("ChallengeFragment", "Exception in onCreateView: ", e10);
            this.f26258D1.post(new RunnableC2290b(0, this));
            return null;
        }
    }
}
