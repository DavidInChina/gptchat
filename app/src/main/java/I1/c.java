package I1;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import io.sentry.android.core.AbstractC3612c;
import q.o1;

/* loaded from: classes.dex */
public final class c extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public b f7956a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((o1) this.f7956a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String str;
        Cursor cursor;
        o1 o1Var = (o1) this.f7956a;
        if (charSequence == null) {
            str = "";
        } else {
            o1Var.getClass();
            str = charSequence.toString();
        }
        SearchView searchView = o1Var.f43497p0;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = o1Var.g(o1Var.f43498q0, str);
            } catch (RuntimeException e10) {
                AbstractC3612c.s("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.f7956a;
        Cursor cursor = ((a) bVar).f7951h0;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((o1) bVar).b((Cursor) obj);
        }
    }
}
