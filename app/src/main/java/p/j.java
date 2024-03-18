package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.openai.chatgpt.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: Y  reason: collision with root package name */
    public int f41590Y = -1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f41591Z;

    public j(k kVar) {
        this.f41591Z = kVar;
        a();
    }

    public final void a() {
        o oVar = this.f41591Z.f41594h0;
        q qVar = oVar.f41626v;
        if (qVar != null) {
            oVar.i();
            ArrayList arrayList = oVar.f41614j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((q) arrayList.get(i10)) == qVar) {
                    this.f41590Y = i10;
                    return;
                }
            }
        }
        this.f41590Y = -1;
    }

    /* renamed from: b */
    public final q getItem(int i10) {
        k kVar = this.f41591Z;
        o oVar = kVar.f41594h0;
        oVar.i();
        ArrayList arrayList = oVar.f41614j;
        kVar.getClass();
        int i11 = this.f41590Y;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (q) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        k kVar = this.f41591Z;
        o oVar = kVar.f41594h0;
        oVar.i();
        int size = oVar.f41614j.size();
        kVar.getClass();
        if (this.f41590Y < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f41591Z.f41593Z.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((D) view).b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
