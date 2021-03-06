/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. 
 * See the copyright.txt in the distribution for a full listing 
 * of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 * 
 * (C) 2005-2006,
 * @author JBoss Inc.
 */
/*
 * Copyright (c) 2003, Arjuna Technologies Limited.
 *
 * $Id: TestSystemExceptionBusinessAgreementWithParticipantCompletionParticipant.java,v 1.1.2.1 2004/05/26 10:04:53 nmcl Exp $
 */

package com.arjuna.wst.tests.common;

import com.arjuna.wst.BusinessAgreementWithParticipantCompletionParticipant;
import com.arjuna.wst.FaultedException;
import com.arjuna.wst.Status;
import com.arjuna.wst.SystemException;
import com.arjuna.wst.WrongStateException;

public class TestSystemExceptionBusinessAgreementWithParticipantCompletionParticipant implements BusinessAgreementWithParticipantCompletionParticipant
{

    public void close () throws WrongStateException, SystemException
    {
	throw new SystemException();
    }
    
    public void cancel () throws WrongStateException, SystemException
    {
	throw new SystemException();
    }

    public void compensate () throws FaultedException, WrongStateException, SystemException
    {
	throw new SystemException();
    }

    public String status () throws SystemException
    {
	return Status.STATUS_ACTIVE;
    }
    
    public void forget () throws WrongStateException, SystemException
    {
	throw new SystemException();
    }

    public void unknown () throws SystemException
    {
	throw new SystemException();
    }

    public void error () throws SystemException
    {
	throw new SystemException();
    }

}
