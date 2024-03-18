package q;

import D1.AbstractC0347e;
import D1.C0345d;
import D1.C0349f;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class J {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        AbstractC0347e abstractC0347e;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                abstractC0347e = new C0345d(clipData, 3);
            } else {
                abstractC0347e = new C0349f(clipData, 3);
            }
            D1.Z.h(textView, abstractC0347e.f());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        AbstractC0347e abstractC0347e;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            abstractC0347e = new C0345d(clipData, 3);
        } else {
            abstractC0347e = new C0349f(clipData, 3);
        }
        D1.Z.h(view, abstractC0347e.f());
        return true;
    }
}
