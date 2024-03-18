package Oc;

import Lg.n;
import Z.AbstractC1710f0;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class b extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f13679a;

    public b(AbstractC1710f0 abstractC1710f0) {
        this.f13679a = abstractC1710f0;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC3557B.c0("consoleMessage", consoleMessage);
        String message = consoleMessage.message();
        AbstractC3557B.b0("message(...)", message);
        if (n.Z1(message, "KaTeX parse error", false)) {
            this.f13679a.setValue(Boolean.TRUE);
            return true;
        }
        return true;
    }
}
