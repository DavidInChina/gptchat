package k4;

import H3.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import h4.q;
import id.AbstractC3557B;
import kf.t;
import nf.AbstractC4825e;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: k4.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4171m implements AbstractC4165g {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f37028a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.n f37029b;

    public C4171m(Uri uri, q4.n nVar) {
        this.f37028a = uri;
        this.f37029b = nVar;
    }

    @Override // k4.AbstractC4165g
    public final Object a(AbstractC4825e abstractC4825e) {
        Integer W12;
        Resources resources;
        BitmapDrawable bitmapDrawable;
        Drawable eVar;
        Uri uri = this.f37028a;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z10 = true;
            if (!(!Lg.n.n2(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) t.p2(uri.getPathSegments());
                if (str != null && (W12 = Lg.m.W1(str)) != null) {
                    int intValue = W12.intValue();
                    q4.n nVar = this.f37029b;
                    Context context = nVar.f43869a;
                    if (AbstractC3557B.K(authority, context.getPackageName())) {
                        resources = context.getResources();
                    } else {
                        resources = context.getPackageManager().getResourcesForApplication(authority);
                    }
                    TypedValue typedValue = new TypedValue();
                    resources.getValue(intValue, typedValue, true);
                    CharSequence charSequence = typedValue.string;
                    String b10 = u4.e.b(MimeTypeMap.getSingleton(), charSequence.subSequence(Lg.n.o2(charSequence, '/', 0, 6), charSequence.length()).toString());
                    if (AbstractC3557B.K(b10, "text/xml")) {
                        if (AbstractC3557B.K(authority, context.getPackageName())) {
                            bitmapDrawable = kotlin.jvm.internal.m.u(context, intValue);
                            if (bitmapDrawable == null) {
                                throw new IllegalStateException(android.gov.nist.core.a.e("Invalid resource ID: ", intValue).toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(intValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next == 2) {
                                if (Build.VERSION.SDK_INT < 24) {
                                    String name = xml.getName();
                                    if (AbstractC3557B.K(name, "vector")) {
                                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                        Resources.Theme theme = context.getTheme();
                                        eVar = new p();
                                        eVar.inflate(resources, xml, asAttributeSet, theme);
                                    } else if (AbstractC3557B.K(name, "animated-vector")) {
                                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                                        Resources.Theme theme2 = context.getTheme();
                                        eVar = new H3.e(context);
                                        eVar.inflate(resources, xml, asAttributeSet2, theme2);
                                    }
                                    bitmapDrawable = eVar;
                                }
                                Resources.Theme theme3 = context.getTheme();
                                ThreadLocal threadLocal = r1.p.f44306a;
                                bitmapDrawable = r1.i.a(resources, intValue, theme3);
                                if (bitmapDrawable == null) {
                                    throw new IllegalStateException(android.gov.nist.core.a.e("Invalid resource ID: ", intValue).toString());
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found.");
                            }
                        }
                        if (!(bitmapDrawable instanceof VectorDrawable) && !(bitmapDrawable instanceof p)) {
                            z10 = false;
                        }
                        if (z10) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), Ad.l.b0(bitmapDrawable, nVar.f43870b, nVar.f43872d, nVar.f43873e, nVar.f43874f));
                        }
                        return new C4162d(bitmapDrawable, z10, h4.f.f31881h0);
                    }
                    TypedValue typedValue2 = new TypedValue();
                    return new C4172n(new q(R4.b.J(R4.b.Z1(resources.openRawResource(intValue, typedValue2))), new h4.p(typedValue2.density)), b10, h4.f.f31881h0);
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
