package Z1;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.openai.chatgpt.R;
import com.openai.feature.widget.impl.WidgetReceiver;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;

/* renamed from: Z1.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1757d0 implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22951a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22952b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22953c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22954d;

    public C1757d0(Context context, int i10, int i11, String str) {
        this.f22951a = context;
        this.f22952b = i10;
        this.f22953c = i11;
        this.f22954d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C1757d0 c1757d0, C1754c c1754c, AbstractC4825e abstractC4825e) {
        C1755c0 c1755c0;
        int i10;
        C1771m c1771m;
        ComponentName componentName;
        c1757d0.getClass();
        if (abstractC4825e instanceof C1755c0) {
            c1755c0 = (C1755c0) abstractC4825e;
            int i11 = c1755c0.f22949i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1755c0.f22949i0 = i11 - Integer.MIN_VALUE;
                Object obj = c1755c0.f22947Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1755c0.f22949i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1771m = c1755c0.f22946Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1755c0.f22946Y = null;
                    c1755c0.f22949i0 = 2;
                    if (c1771m.e(c1755c0) == enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                Context context = c1757d0.f22951a;
                AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(c1757d0.f22952b);
                if (appWidgetInfo != null) {
                    componentName = appWidgetInfo.provider;
                } else {
                    componentName = null;
                }
                if (componentName != null) {
                    Object newInstance = Class.forName(appWidgetInfo.provider.getClassName()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver", newInstance);
                    C1771m c1771m2 = new C1771m(((WidgetReceiver) ((AbstractC1751a0) newInstance)).f27706b, c1754c, null, 12);
                    D5.a aVar = g2.s.f31134a;
                    c1755c0.f22946Y = c1771m2;
                    c1755c0.f22949i0 = 1;
                    if (aVar.e(context, c1771m2, c1755c0) != enumC5000a) {
                        c1771m = c1771m2;
                        c1755c0.f22946Y = null;
                        c1755c0.f22949i0 = 2;
                        if (c1771m.e(c1755c0) == enumC5000a) {
                        }
                    } else {
                        return enumC5000a;
                    }
                }
                return yVar;
            }
        }
        c1755c0 = new C1755c0(c1757d0, abstractC4825e);
        Object obj2 = c1755c0.f22947Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1755c0.f22949i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
    }

    public final s0 b() {
        s0 s0Var;
        t0 t0Var = GlanceRemoteViewsService.f25142Y;
        int i10 = this.f22952b;
        int i11 = this.f22953c;
        String str = this.f22954d;
        t0 t0Var2 = GlanceRemoteViewsService.f25142Y;
        synchronized (t0Var2) {
            s0Var = (s0) t0Var2.f23111a.get(t0.b(i10, i11, str));
            if (s0Var == null) {
                s0Var = s0.f23097e;
            }
        }
        return s0Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().f23098a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        try {
            return b().f23098a[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i10) {
        try {
            return b().f23099b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f22951a.getPackageName(), (int) R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().f23101d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return b().f23100c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        Ad.l.a1(C4832l.f40334Y, new C1753b0(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        t0 t0Var = GlanceRemoteViewsService.f25142Y;
        int i10 = this.f22952b;
        int i11 = this.f22953c;
        String str = this.f22954d;
        t0 t0Var2 = GlanceRemoteViewsService.f25142Y;
        synchronized (t0Var2) {
            t0Var2.f23111a.remove(t0.b(i10, i11, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
