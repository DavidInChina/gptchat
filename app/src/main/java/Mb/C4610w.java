package mb;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import ld.C4429b;
import nd.C4812a;

/* renamed from: mb.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4610w {

    /* renamed from: a  reason: collision with root package name */
    public final w2.t f39110a;

    /* JADX WARN: Type inference failed for: r6v5, types: [u2.b, android.database.sqlite.SQLiteOpenHelper] */
    public C4610w(Application application, C4812a c4812a, C4429b c4429b) {
        File file = new File(application.getCacheDir(), "text-to-speech/" + c4812a.f40276c);
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
        c4429b.a(new C4609v(file, null));
        this.f39110a = new w2.t(file, new w2.q(), new SQLiteOpenHelper(application.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1));
    }
}
