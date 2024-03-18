package android.javax.sip;

import d.AbstractC2562c;
import java.util.EventObject;

/* loaded from: classes.dex */
public abstract class l extends EventObject {
    private b m_dialog;
    private AbstractC2562c m_response;
    private a m_transaction;

    public l(Object obj, a aVar, b bVar, AbstractC2562c abstractC2562c) {
        super(obj);
        this.m_response = abstractC2562c;
        this.m_transaction = aVar;
        this.m_dialog = bVar;
    }

    public a getClientTransaction() {
        return this.m_transaction;
    }

    public b getDialog() {
        return this.m_dialog;
    }

    public AbstractC2562c getResponse() {
        return this.m_response;
    }
}
