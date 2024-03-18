package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends BaseAdapter {

    /* renamed from: Y  reason: collision with root package name */
    public final o f41598Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f41599Z = -1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f41600h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f41601i0;

    /* renamed from: j0  reason: collision with root package name */
    public final LayoutInflater f41602j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f41603k0;

    public l(o oVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f41601i0 = z10;
        this.f41602j0 = layoutInflater;
        this.f41598Y = oVar;
        this.f41603k0 = i10;
        a();
    }

    public final void a() {
        o oVar = this.f41598Y;
        q qVar = oVar.f41626v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f41614j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f41599Z = i10;
                    return;
                }
            }
        }
        this.f41599Z = -1;
    }

    /* renamed from: b */
    public final q getItem(int i10) {
        ArrayList arrayList;
        boolean z10 = this.f41601i0;
        o oVar = this.f41598Y;
        if (z10) {
            oVar.i();
            arrayList = oVar.f41614j;
        } else {
            arrayList = oVar.l();
        }
        int i11 = this.f41599Z;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList;
        boolean z10 = this.f41601i0;
        o oVar = this.f41598Y;
        if (z10) {
            oVar.i();
            arrayList = oVar.f41614j;
        } else {
            arrayList = oVar.l();
        }
        if (this.f41599Z < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10 = false;
        if (view == null) {
            view = this.f41602j0.inflate(this.f41603k0, viewGroup, false);
        }
        int i12 = getItem(i10).f41636b;
        int i13 = i10 - 1;
        if (i13 >= 0) {
            i11 = getItem(i13).f41636b;
        } else {
            i11 = i12;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f41598Y.m() && i12 != i11) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        D d10 = (D) view;
        if (this.f41600h0) {
            listMenuItemView.setForceShowIcon(true);
        }
        d10.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
