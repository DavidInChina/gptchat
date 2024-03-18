package c5;

import Lg.n;
import Z.AbstractC1710f0;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import id.AbstractC3557B;
import x8.W;

/* renamed from: c5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292d extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26251a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f26252b;

    public /* synthetic */ C2292d(int i10, Object obj) {
        this.f26251a = i10;
        this.f26252b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f26251a) {
            case 1:
                AbstractC3557B.c0("view", webView);
                AbstractC3557B.c0("url", str);
                ((AbstractC1710f0) this.f26252b).setValue(Boolean.TRUE);
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f26251a) {
            case 0:
                Object obj = this.f26252b;
                try {
                    ((C2294f) obj).f26266t1.stopLoading();
                    if (((C2294f) obj).f26266t1.canGoBack()) {
                        ((C2294f) obj).f26266t1.goBack();
                    }
                    ((C2294f) obj).T(webResourceError.getDescription().toString());
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                AbstractC3557B.c0("view", webView);
                AbstractC3557B.c0("request", webResourceRequest);
                AbstractC3557B.c0("error", webResourceError);
                Pc.c a5 = Pc.e.a();
                CharSequence description = webResourceError.getDescription();
                int errorCode = webResourceError.getErrorCode();
                W.M(a5, "Unable to load latex: " + ((Object) description) + " (" + errorCode + ").", null, 6);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String path;
        switch (this.f26251a) {
            case 1:
                AbstractC3557B.c0("view", webView);
                AbstractC3557B.c0("request", webResourceRequest);
                Uri url = webResourceRequest.getUrl();
                if (AbstractC3557B.K(url.getHost(), "cdn.jsdelivr.net") && (path = url.getPath()) != null && n.I2(path, "/npm/katex", false)) {
                    return null;
                }
                return new WebResourceResponse("text/plain", "UTF-8", null);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }
}
