package B3;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes2.dex */
public interface b extends Closeable {
    boolean B0();

    void Q(boolean z10);

    void U();

    void W(String str, Object[] objArr);

    void X();

    int Y(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    boolean isOpen();

    void j0();

    void n();

    void s(int i10);

    void t(String str);

    i x(String str);

    Cursor x0(h hVar);

    boolean y0();

    Cursor z(h hVar, CancellationSignal cancellationSignal);
}
