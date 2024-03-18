package ud;

import Ng.F;
import Z.AbstractC1710f0;
import android.gov.nist.core.Separators;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.internal.play_billing.N;
import eh.AbstractC2904d;
import eh.C2903c;
import id.AbstractC3557B;
import jf.y;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f46702Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ WebView f46703Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f46704h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46705i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46706j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46707k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, WebView webView, String str2, AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02, AbstractC1710f0 abstractC1710f03, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46702Y = str;
        this.f46703Z = webView;
        this.f46704h0 = str2;
        this.f46705i0 = abstractC1710f0;
        this.f46706j0 = abstractC1710f02;
        this.f46707k0 = abstractC1710f03;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new l(this.f46702Y, this.f46703Z, this.f46704h0, this.f46705i0, this.f46706j0, this.f46707k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        boolean booleanValue = ((Boolean) this.f46705i0.getValue()).booleanValue();
        y yVar = y.f36177a;
        if (!booleanValue) {
            return yVar;
        }
        byte[] bytes = this.f46702Y.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        String encodeToString = Base64.encodeToString(bytes, 2);
        final long currentTimeMillis = System.currentTimeMillis();
        String str = this.f46704h0;
        if (str == null) {
            str = "unknown";
        }
        final AbstractC1710f0 abstractC1710f0 = this.f46706j0;
        final AbstractC1710f0 abstractC1710f02 = this.f46707k0;
        final String str2 = this.f46704h0;
        this.f46703Z.evaluateJavascript("highlightCode('" + str + "', '" + encodeToString + "')", new ValueCallback() { // from class: ud.k
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj2) {
                AbstractC1710f0 abstractC1710f03 = abstractC1710f02;
                String str3 = (String) obj2;
                abstractC1710f0.setValue(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                boolean K10 = AbstractC3557B.K(str3, "null");
                String str4 = str2;
                if (K10) {
                    W.G(Pc.e.a(), android.gov.nist.core.a.A("Javascript syntax highlighting returned null for ", str4, Separators.DOT), null, 6);
                    return;
                }
                try {
                    C2903c c2903c = AbstractC2904d.f29415d;
                    KSerializer serializer = h.Companion.serializer();
                    AbstractC3557B.Z(str3);
                    abstractC1710f03.setValue((h) c2903c.b(serializer, str3));
                } catch (Exception e10) {
                    Pc.c a5 = Pc.e.a();
                    W.G(a5, "Error decoding syntax highlighting for " + str4, e10, 4);
                }
            }
        });
        return yVar;
    }
}
