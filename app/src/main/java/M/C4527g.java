package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.openai.chatgpt.R;
import l.AbstractC4308a;

/* renamed from: m.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4527g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38745a;

    /* renamed from: b  reason: collision with root package name */
    public final DialogInterfaceC4529i f38746b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f38747c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f38748d;

    /* renamed from: e  reason: collision with root package name */
    public AlertController$RecycleListView f38749e;

    /* renamed from: f  reason: collision with root package name */
    public Button f38750f;

    /* renamed from: g  reason: collision with root package name */
    public Button f38751g;

    /* renamed from: h  reason: collision with root package name */
    public Button f38752h;

    /* renamed from: i  reason: collision with root package name */
    public NestedScrollView f38753i;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f38755k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f38756l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f38757m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f38758n;

    /* renamed from: o  reason: collision with root package name */
    public View f38759o;

    /* renamed from: p  reason: collision with root package name */
    public ListAdapter f38760p;

    /* renamed from: r  reason: collision with root package name */
    public final int f38762r;

    /* renamed from: s  reason: collision with root package name */
    public final int f38763s;

    /* renamed from: t  reason: collision with root package name */
    public final int f38764t;

    /* renamed from: u  reason: collision with root package name */
    public final int f38765u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f38766v;

    /* renamed from: w  reason: collision with root package name */
    public final HandlerC4525e f38767w;

    /* renamed from: j  reason: collision with root package name */
    public int f38754j = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f38761q = -1;

    /* renamed from: x  reason: collision with root package name */
    public final View$OnClickListenerC4522b f38768x = new View$OnClickListenerC4522b(0, this);

    public C4527g(Context context, DialogInterfaceC4529i dialogInterfaceC4529i, Window window) {
        this.f38745a = context;
        this.f38746b = dialogInterfaceC4529i;
        this.f38747c = window;
        this.f38767w = new HandlerC4525e(dialogInterfaceC4529i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4308a.f37668e, R.attr.alertDialogStyle, 0);
        this.f38762r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f38763s = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f38764t = obtainStyledAttributes.getResourceId(7, 0);
        this.f38765u = obtainStyledAttributes.getResourceId(3, 0);
        this.f38766v = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC4529i.k().f(1);
    }

    public static void a(View view, View view2, View view3) {
        int i10;
        int i11 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i11 = 0;
            }
            view3.setVisibility(i11);
        }
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
