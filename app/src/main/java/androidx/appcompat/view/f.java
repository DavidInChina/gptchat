package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f24354f;

    /* renamed from: a  reason: collision with root package name */
    public int f24355a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f24356b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f24357c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f24358d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f24359e;

    public f(Context context, int i10) {
        super(context);
        this.f24355a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f24359e == null) {
            if (this.f24358d == null) {
                this.f24358d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f24356b == null) {
            this.f24356b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24356b.setTo(theme);
            }
        }
        this.f24356b.applyStyle(this.f24355a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(androidx.appcompat.view.f.f24354f) != false) goto L14;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f24359e == null) {
            Configuration configuration = this.f24358d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f24354f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f24354f = configuration2;
                    }
                }
                this.f24359e = e.a(this, this.f24358d).getResources();
            }
            this.f24359e = super.getResources();
        }
        return this.f24359e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f24357c == null) {
                this.f24357c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f24357c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f24356b;
        if (theme != null) {
            return theme;
        }
        if (this.f24355a == 0) {
            this.f24355a = 2131952199;
        }
        b();
        return this.f24356b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f24355a != i10) {
            this.f24355a = i10;
            b();
        }
    }
}
