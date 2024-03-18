package android.javax.sip;

import java.util.EventListener;

/* loaded from: classes.dex */
public interface p extends EventListener {
    void processDialogTerminated(e eVar);

    void processIOException(f fVar);

    void processRequest(k kVar);

    void processResponse(l lVar);

    void processTimeout(t tVar);

    void processTransactionTerminated(w wVar);
}
