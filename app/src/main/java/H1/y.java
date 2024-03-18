package H1;

import D1.AbstractC0351g;
import D1.AbstractC0375v;
import D1.C0353h;
import android.content.ClipData;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class y implements AbstractC0375v {
    public final C0353h a(View view, C0353h c0353h) {
        CharSequence charSequence;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0353h);
        }
        if (c0353h.f3268a.g() == 2) {
            return c0353h;
        }
        AbstractC0351g abstractC0351g = c0353h.f3268a;
        ClipData h10 = abstractC0351g.h();
        int l10 = abstractC0351g.l();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < h10.getItemCount(); i10++) {
            ClipData.Item itemAt = h10.getItemAt(i10);
            if ((l10 & 1) != 0) {
                charSequence = itemAt.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence = charSequence.toString();
                }
            } else {
                charSequence = itemAt.coerceToStyledText(context);
            }
            if (charSequence != null) {
                if (!z10) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, charSequence);
                    z10 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), Separators.RETURN);
                    editable.insert(Selection.getSelectionEnd(editable), charSequence);
                }
            }
        }
        return null;
    }
}
