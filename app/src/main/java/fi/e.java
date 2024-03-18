package fi;

import android.util.Log;
import id.AbstractC3557B;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30909a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i10;
        int min;
        AbstractC3557B.c0("record", logRecord);
        CopyOnWriteArraySet copyOnWriteArraySet = d.f30907a;
        String loggerName = logRecord.getLoggerName();
        AbstractC3557B.b0("record.loggerName", loggerName);
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i10 = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        String message = logRecord.getMessage();
        AbstractC3557B.b0("record.message", message);
        Throwable thrown = logRecord.getThrown();
        String str = (String) d.f30908b.get(loggerName);
        if (str == null) {
            str = Lg.o.Z2(23, loggerName);
        }
        if (Log.isLoggable(str, i10)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                int k22 = Lg.n.k2(message, '\n', i11, false, 4);
                if (k22 == -1) {
                    k22 = length;
                }
                while (true) {
                    min = Math.min(k22, i11 + 4000);
                    String substring = message.substring(i11, min);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    Log.println(i10, str, substring);
                    if (min >= k22) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
