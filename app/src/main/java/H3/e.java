package H3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.util.ArrayList;
import n.C4696g;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.C5200d;
import q1.AbstractC5260f;
import r9.y;
import t1.AbstractC5655a;
import t1.AbstractC5656b;
import w.C6049A;

/* loaded from: classes2.dex */
public final class e extends g implements Animatable {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f7359l0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f7361h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5200d f7362i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f7363j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public final C4696g f7364k0 = new C4696g(1, this);

    /* renamed from: Z  reason: collision with root package name */
    public final c f7360Z = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [H3.c, android.graphics.drawable.Drawable$ConstantState] */
    public e(Context context) {
        this.f7361h0 = context;
    }

    @Override // H3.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5656b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f7360Z;
        cVar.f7354a.draw(canvas);
        if (cVar.f7355b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5655a.a(drawable);
        }
        return this.f7360Z.f7354a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f7360Z.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5656b.c(drawable);
        }
        return this.f7360Z.f7354a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7366Y != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.f7366Y.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f7360Z.f7354a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f7360Z.f7354a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f7360Z.f7354a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5655a.d(drawable);
        }
        return this.f7360Z.f7354a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f7360Z.f7355b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f7360Z.f7354a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7360Z.f7354a.setBounds(rect);
        }
    }

    @Override // H3.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f7360Z.f7354a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f7360Z.f7354a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f7360Z.f7354a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5655a.e(drawable, z10);
        } else {
            this.f7360Z.f7354a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7360Z.f7354a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5260f.P(drawable, i10);
        } else {
            this.f7360Z.f7354a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5260f.Q(drawable, colorStateList);
        } else {
            this.f7360Z.f7354a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5260f.R(drawable, mode);
        } else {
            this.f7360Z.f7354a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f7360Z.f7354a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f7360Z;
        if (cVar.f7355b.isStarted()) {
            return;
        }
        cVar.f7355b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7360Z.f7355b.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0175, code lost:
        if (r8.f7355b != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
        r8.f7355b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x017e, code lost:
        r8.f7355b.playTogether(r8.f7356c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0185, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Type inference failed for: r12v8, types: [w.A, w.f] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator animator;
        p pVar;
        int next;
        p pVar2;
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c cVar = this.f7360Z;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray O02 = y.O0(resources, theme, attributeSet, a.f7346e);
                    int resourceId = O02.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = p.f7423o0;
                        if (Build.VERSION.SDK_INT >= 24) {
                            pVar = new p();
                            ThreadLocal threadLocal = r1.p.f44306a;
                            pVar.f7366Y = r1.i.a(resources, resourceId, theme);
                            new o(pVar.f7366Y.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                while (true) {
                                    next = xml.next();
                                    if (next == 2 || next == 1) {
                                        break;
                                    }
                                }
                                if (next == 2) {
                                    pVar = new p();
                                    pVar.inflate(resources, xml, asAttributeSet, theme);
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                    break;
                                }
                            } catch (IOException e10) {
                                AbstractC3612c.d("VectorDrawableCompat", "parser error", e10);
                                pVar = null;
                                pVar.f7428k0 = false;
                                pVar.setCallback(this.f7364k0);
                                pVar2 = cVar.f7354a;
                                if (pVar2 != null) {
                                }
                                cVar.f7354a = pVar;
                                O02.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e11) {
                                AbstractC3612c.d("VectorDrawableCompat", "parser error", e11);
                                pVar = null;
                                pVar.f7428k0 = false;
                                pVar.setCallback(this.f7364k0);
                                pVar2 = cVar.f7354a;
                                if (pVar2 != null) {
                                }
                                cVar.f7354a = pVar;
                                O02.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        pVar.f7428k0 = false;
                        pVar.setCallback(this.f7364k0);
                        pVar2 = cVar.f7354a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        cVar.f7354a = pVar;
                    }
                    O02.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f7347f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f7361h0;
                            if (context != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    animator = AnimatorInflater.loadAnimator(context, resourceId2);
                                } else {
                                    Resources resources2 = context.getResources();
                                    Resources.Theme theme2 = context.getTheme();
                                    try {
                                        try {
                                            try {
                                                xmlResourceParser = resources2.getAnimation(resourceId2);
                                                animator = Gi.e.s(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
                                                xmlResourceParser.close();
                                            } catch (IOException e12) {
                                                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                                notFoundException.initCause(e12);
                                                throw notFoundException;
                                            }
                                        } catch (XmlPullParserException e13) {
                                            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException2.initCause(e13);
                                            throw notFoundException2;
                                        }
                                    } catch (Throwable th2) {
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                        throw th2;
                                    }
                                }
                                animator.setTarget(cVar.f7354a.f7424Z.f7411b.f7409o.get(string));
                                if (cVar.f7356c == null) {
                                    cVar.f7356c = new ArrayList();
                                    cVar.f7357d = new C6049A(0);
                                }
                                cVar.f7356c.add(animator);
                                cVar.f7357d.put(animator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
