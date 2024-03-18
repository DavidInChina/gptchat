package I1;

import H0.u1;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import q.K0;
import q.o1;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f7949Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f7950Z;

    /* renamed from: h0  reason: collision with root package name */
    public Cursor f7951h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7952i0;

    /* renamed from: j0  reason: collision with root package name */
    public u1 f7953j0;

    /* renamed from: k0  reason: collision with root package name */
    public K0 f7954k0;

    /* renamed from: l0  reason: collision with root package name */
    public c f7955l0;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f7951h0;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                u1 u1Var = this.f7953j0;
                if (u1Var != null) {
                    cursor2.unregisterContentObserver(u1Var);
                }
                K0 k02 = this.f7954k0;
                if (k02 != null) {
                    cursor2.unregisterDataSetObserver(k02);
                }
            }
            this.f7951h0 = cursor;
            if (cursor != null) {
                u1 u1Var2 = this.f7953j0;
                if (u1Var2 != null) {
                    cursor.registerContentObserver(u1Var2);
                }
                K0 k03 = this.f7954k0;
                if (k03 != null) {
                    cursor.registerDataSetObserver(k03);
                }
                this.f7952i0 = cursor.getColumnIndexOrThrow("_id");
                this.f7949Y = true;
                notifyDataSetChanged();
            } else {
                this.f7952i0 = -1;
                this.f7949Y = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f7949Y && (cursor = this.f7951h0) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7949Y) {
            this.f7951h0.moveToPosition(i10);
            if (view == null) {
                o1 o1Var = (o1) this;
                view = o1Var.f43496o0.inflate(o1Var.f43495n0, viewGroup, false);
            }
            a(view, this.f7951h0);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, I1.c] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f7955l0 == null) {
            ?? filter = new Filter();
            filter.f7956a = this;
            this.f7955l0 = filter;
        }
        return this.f7955l0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f7949Y && (cursor = this.f7951h0) != null) {
            cursor.moveToPosition(i10);
            return this.f7951h0;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f7949Y || (cursor = this.f7951h0) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f7951h0.getLong(this.f7952i0);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f7949Y) {
            if (this.f7951h0.moveToPosition(i10)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f7951h0);
                return view;
            }
            throw new IllegalStateException(android.gov.nist.core.a.e("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
