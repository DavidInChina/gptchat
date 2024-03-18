package q;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes2.dex */
public final class z1 implements AbstractC5236t0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f43598a;

    /* renamed from: b  reason: collision with root package name */
    public int f43599b;

    /* renamed from: c  reason: collision with root package name */
    public View f43600c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f43601d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f43602e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f43603f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f43604g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f43605h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f43606i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f43607j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f43608k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f43609l;

    /* renamed from: m  reason: collision with root package name */
    public C5222m f43610m;

    /* renamed from: n  reason: collision with root package name */
    public int f43611n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f43612o;

    public final void a(int i10) {
        View view;
        int i11 = this.f43599b ^ i10;
        this.f43599b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                int i12 = this.f43599b & 4;
                Toolbar toolbar = this.f43598a;
                if (i12 != 0) {
                    Drawable drawable = this.f43603f;
                    if (drawable == null) {
                        drawable = this.f43612o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f43598a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f43605h);
                    toolbar2.setSubtitle(this.f43606i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f43600c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f43599b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f43607j);
            Toolbar toolbar = this.f43598a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f43611n);
            } else {
                toolbar.setNavigationContentDescription(this.f43607j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f43599b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f43602e;
                if (drawable == null) {
                    drawable = this.f43601d;
                }
            } else {
                drawable = this.f43601d;
            }
        } else {
            drawable = null;
        }
        this.f43598a.setLogo(drawable);
    }
}
