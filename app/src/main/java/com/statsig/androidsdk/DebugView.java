package com.statsig.androidsdk;

import K4.J;
import Lg.n;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.gov.nist.core.Separators;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.statsig.androidsdk.DebugView;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/DebugView;", "", "()V", "Companion", "DebugViewJsBridge", "DebugWebChromeClient", "DebugWebViewClient", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class DebugView {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/statsig/androidsdk/DebugView$Companion;", "", "Landroid/content/Context;", "context", "Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "client", "Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "chromeClient", "Landroid/webkit/WebView;", "getConfiguredWebView", "(Landroid/content/Context;Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;)Landroid/webkit/WebView;", "", "sdkKey", "", "state", "Ljf/y;", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", "<init>", "()V", "build_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final WebView getConfiguredWebView(Context context, DebugWebViewClient debugWebViewClient, DebugWebChromeClient debugWebChromeClient) {
            WebView webView = new WebView(context);
            webView.setWebViewClient(debugWebViewClient);
            webView.setWebChromeClient(debugWebChromeClient);
            webView.setSystemUiVisibility(2);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setJavaScriptEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            return webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: show$lambda-0  reason: not valid java name */
        public static final boolean m69show$lambda0(WebView webView, Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
            List list;
            String str;
            AbstractC3557B.c0("$webView", webView);
            AbstractC3557B.c0("$dialog", dialog);
            if (i10 != 4 || keyEvent.getAction() != 1 || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            String url = webView.getUrl();
            Boolean bool = null;
            if (url == null) {
                list = null;
            } else {
                list = n.G2(url, new String[]{Separators.SLASH});
            }
            if (list != null && (str = (String) t.o2(list)) != null) {
                bool = Boolean.valueOf(n.I2(str, "client_sdk_debugger", false));
            }
            if (AbstractC3557B.K(bool, Boolean.TRUE)) {
                dialog.dismiss();
            }
            return true;
        }

        public final void show(Context context, String str, Map<String, ? extends Object> map) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("sdkKey", str);
            AbstractC3557B.c0("state", map);
            final Dialog dialog = new Dialog(context, 16973834);
            String i10 = new I8.n().i(map);
            AbstractC3557B.b0("Gson().toJson(state)", i10);
            final WebView configuredWebView = getConfiguredWebView(context, new DebugWebViewClient(i10), new DebugWebChromeClient(dialog));
            dialog.requestWindowFeature(1);
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.statsig.androidsdk.a
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                    boolean m69show$lambda0;
                    m69show$lambda0 = DebugView.Companion.m69show$lambda0(configuredWebView, dialog, dialogInterface, i11, keyEvent);
                    return m69show$lambda0;
                }
            });
            configuredWebView.loadUrl(AbstractC3557B.v2("https://console.statsig.com/client_sdk_debugger_redirect?sdkKey=", str));
            dialog.setContentView(configuredWebView);
            dialog.show();
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/statsig/androidsdk/DebugView$DebugViewJsBridge;", "", "Ljf/y;", "closeDialog", "()V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "<init>", "(Landroid/content/Context;Landroid/app/Dialog;)V", "build_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class DebugViewJsBridge {
        private final Context context;
        private final Dialog dialog;

        public DebugViewJsBridge(Context context, Dialog dialog) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("dialog", dialog);
            this.context = context;
            this.dialog = dialog;
        }

        @JavascriptInterface
        public final void closeDialog() {
            this.dialog.dismiss();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "Landroid/webkit/WebChromeClient;", "dialog", "Landroid/app/Dialog;", "(Landroid/app/Dialog;)V", "closeAction", "", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class DebugWebChromeClient extends WebChromeClient {
        private final String closeAction = "STATSIG_ANDROID_DEBUG_CLOSE_DIALOG";
        private final Dialog dialog;

        public DebugWebChromeClient(Dialog dialog) {
            AbstractC3557B.c0("dialog", dialog);
            this.dialog = dialog;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
            if (Lg.n.f2(r0, r1) != false) goto L18;
         */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message;
            if (consoleMessage != null && (message = consoleMessage.message()) != null) {
                String str = this.closeAction;
                if (!(str instanceof String)) {
                    if (message != str) {
                        if (str != null && message.length() == str.length()) {
                            int length = message.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                if (!J.q(message.charAt(i10), str.charAt(i10), true)) {
                                    break;
                                }
                            }
                        }
                    }
                    this.dialog.dismiss();
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "", "url", "Ljf/y;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "json", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "build_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    public static final class DebugWebViewClient extends WebViewClient {
        private final String json;

        public DebugWebViewClient(String str) {
            AbstractC3557B.c0("json", str);
            this.json = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (webView != null) {
                webView.evaluateJavascript("window.__StatsigAndroidDebug=true;", null);
            }
            String n10 = android.gov.nist.core.a.n(new StringBuilder("window.__StatsigClientState = "), this.json, ';');
            if (webView != null) {
                webView.evaluateJavascript(n10, null);
            }
        }
    }
}
