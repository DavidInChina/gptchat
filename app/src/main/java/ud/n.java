package ud;

import Z.AbstractC1710f0;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import id.AbstractC3557B;
import x8.W;

/* loaded from: classes2.dex */
public final class n extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f46710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46711b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46712c;

    public n(long j6, AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02) {
        this.f46710a = j6;
        this.f46711b = abstractC1710f0;
        this.f46712c = abstractC1710f02;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC3557B.c0("view", webView);
        AbstractC3557B.c0("url", str);
        this.f46711b.setValue(Long.valueOf(System.currentTimeMillis() - this.f46710a));
        this.f46712c.setValue(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        AbstractC3557B.c0("description", str);
        AbstractC3557B.c0("failingUrl", str2);
        Pc.c a5 = Pc.e.a();
        W.M(a5, "Unable to load syntax highlighting: " + str + " (" + i10 + ").", null, 6);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC3557B.c0("request", webResourceRequest);
        AbstractC3557B.c0("error", webResourceError);
        Pc.c a5 = Pc.e.a();
        CharSequence description = webResourceError.getDescription();
        int errorCode = webResourceError.getErrorCode();
        W.M(a5, "Unable to load syntax highlighting: " + ((Object) description) + " (" + errorCode + ").", null, 6);
    }
}
