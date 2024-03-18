package android.gov.nist.javax.sip.message;

import android.gov.nist.javax.sip.header.SIPHeader;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class HeaderIterator implements ListIterator {
    private int index;
    private SIPHeader sipHeader;
    private SIPMessage sipMessage;
    private boolean toRemove;

    public HeaderIterator(SIPMessage sIPMessage, SIPHeader sIPHeader) {
        this.sipMessage = sIPMessage;
        this.sipHeader = sIPHeader;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.index == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.index == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        SIPHeader sIPHeader = this.sipHeader;
        if (sIPHeader != null && this.index != 1) {
            this.toRemove = true;
            this.index = 1;
            return sIPHeader;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 1;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        SIPHeader sIPHeader = this.sipHeader;
        if (sIPHeader != null && this.index != 0) {
            this.toRemove = true;
            this.index = 0;
            return sIPHeader;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        if (this.index == 0) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (this.sipHeader != null) {
            if (this.toRemove) {
                SIPHeader sIPHeader = null;
                this.sipHeader = null;
                this.sipMessage.removeHeader(sIPHeader.getName());
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
