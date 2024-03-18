package android.javax.sip;

import d.AbstractC2561b;
import java.util.EventObject;

/* loaded from: classes.dex */
public abstract class k extends EventObject {
    private b m_dialog;
    private AbstractC2561b m_request;
    private m m_transaction;

    public k(Object obj, m mVar, b bVar, AbstractC2561b abstractC2561b) {
        super(obj);
        this.m_transaction = mVar;
        this.m_request = abstractC2561b;
        this.m_dialog = bVar;
    }

    public b getDialog() {
        return this.m_dialog;
    }

    public AbstractC2561b getRequest() {
        return this.m_request;
    }

    public m getServerTransaction() {
        return this.m_transaction;
    }
}
