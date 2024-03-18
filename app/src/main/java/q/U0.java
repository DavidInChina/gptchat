package q;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.sentry.android.core.AbstractC3612c;
import n.C4695f;
import o.AbstractC4864b;

/* loaded from: classes2.dex */
public final class U0 implements W0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43362a;

    public /* synthetic */ U0(int i10) {
        this.f43362a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f43362a) {
            case 0:
                try {
                    return C4695f.e(context, theme, context.getResources(), attributeSet, xmlResourceParser);
                } catch (Exception e10) {
                    AbstractC3612c.d("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    H3.e eVar = new H3.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e11) {
                    AbstractC3612c.d("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                    return null;
                }
            case 2:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) U0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC4864b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e12) {
                    AbstractC3612c.d("DrawableDelegate", "Exception while inflating <drawable>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    H3.p pVar = new H3.p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return pVar;
                } catch (Exception e13) {
                    AbstractC3612c.d("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
