package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import m.C4524d;
import m.C4528h;
import m.DialogInterfaceC4529i;

/* loaded from: classes.dex */
public final class k implements C, AdapterView.OnItemClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public Context f41592Y;

    /* renamed from: Z  reason: collision with root package name */
    public LayoutInflater f41593Z;

    /* renamed from: h0  reason: collision with root package name */
    public o f41594h0;

    /* renamed from: i0  reason: collision with root package name */
    public ExpandedMenuView f41595i0;

    /* renamed from: j0  reason: collision with root package name */
    public B f41596j0;

    /* renamed from: k0  reason: collision with root package name */
    public j f41597k0;

    public k(Context context) {
        this.f41592Y = context;
        this.f41593Z = LayoutInflater.from(context);
    }

    @Override // p.C
    public final void b(o oVar, boolean z10) {
        B b10 = this.f41596j0;
        if (b10 != null) {
            b10.b(oVar, z10);
        }
    }

    @Override // p.C
    public final void c(Context context, o oVar) {
        if (this.f41592Y != null) {
            this.f41592Y = context;
            if (this.f41593Z == null) {
                this.f41593Z = LayoutInflater.from(context);
            }
        }
        this.f41594h0 = oVar;
        j jVar = this.f41597k0;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // p.C
    public final boolean d() {
        return false;
    }

    @Override // p.C
    public final void e(B b10) {
        this.f41596j0 = b10;
    }

    @Override // p.C
    public final void g() {
        j jVar = this.f41597k0;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, p.p, android.content.DialogInterface$OnKeyListener, p.B, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    @Override // p.C
    public final boolean i(I i10) {
        if (!i10.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f41629Y = i10;
        Context context = i10.f41605a;
        C4528h c4528h = new C4528h(context);
        k kVar = new k(((C4524d) c4528h.f38770Z).f38733a);
        obj.f41631h0 = kVar;
        kVar.f41596j0 = obj;
        i10.b(kVar, context);
        k kVar2 = obj.f41631h0;
        if (kVar2.f41597k0 == null) {
            kVar2.f41597k0 = new j(kVar2);
        }
        j jVar = kVar2.f41597k0;
        Object obj2 = c4528h.f38770Z;
        C4524d c4524d = (C4524d) obj2;
        c4524d.f38739g = jVar;
        c4524d.f38740h = obj;
        View view = i10.f41619o;
        if (view != null) {
            c4524d.f38737e = view;
        } else {
            c4524d.f38735c = i10.f41618n;
            ((C4524d) obj2).f38736d = i10.f41617m;
        }
        ((C4524d) obj2).f38738f = obj;
        DialogInterfaceC4529i k10 = c4528h.k();
        obj.f41630Z = k10;
        k10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f41630Z.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f41630Z.show();
        B b10 = this.f41596j0;
        if (b10 != null) {
            b10.A(i10);
            return true;
        }
        return true;
    }

    @Override // p.C
    public final boolean j(q qVar) {
        return false;
    }

    @Override // p.C
    public final boolean k(q qVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        this.f41594h0.q(this.f41597k0.getItem(i10), this, 0);
    }
}
